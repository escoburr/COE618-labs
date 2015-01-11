package lab5;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Console {

	private Controller controller;
	private String username;
	private String password;
	private String name;
	private int option;
	private boolean isStudent = false;
	private boolean isInstructor = false;
	private StudentAccount studAccount;
	private InstructorAccount intsAccount;

	public Console() {
		controller = new Controller();
/*		controller.addAccounts();
		try {
			controller.saveToFile();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}*/
		
		
		login: while (true) {
			displayLogin();
			if (getAccount(new Account(username, password,name)) == true) {
				while (isStudent) {
					displayStudentMenu();
					switch (option) {
					case 1:
						studentRegisterCourses();
						break;
					case 2:
						studentViewCourseInfo();
						break;
					case 3:
						studentGradeInfo();
						break;
					case 4:
						try {
							logOut();
						} catch (IOException e) {
							System.out.println("save to file failed");
							e.printStackTrace();
						}
						System.exit(1);
						//continue login;
						break;
					default:
						break;
					}
				}
				while (isInstructor) {
					displayInstructorMenu();
				}
			} else
				continue;

		}
	}

	private void logOut() throws IOException {
		controller.saveToFile();
		
	}

	private void studentRegisterCourses() {
		int opt = 0;
		String[] s = controller.getCourseEnrollmentList();
		for (int i = 0; i < s.length; i++) {
			System.out.println ((i+1)+" "+s[i]);
		}
		Scanner in = new Scanner(System.in);
		opt = in.nextInt();
		studAccount.getEnrolledCourses().add(s[opt-1]);
		controller.updateAccount(studAccount);
	}

	private void studentGradeInfo() {
		// EFFECTS: returns list of courses student is currently enrolled in
		ArrayList<String> glist = studAccount.getGradeList();
		System.out.println("Your grades:");
		for (String s : glist) {
			System.out.println(s);
		}
	}

	private void studentViewCourseInfo() {
		// EFFECTS: returns list of courses student is currently enrolled in
		ArrayList<String> clist = studAccount.getEnrolledCourses();
		System.out
				.println("You are currently enrolled in the following courses:");
		for (String s : clist) {
			System.out.println(s);
		}
	}

	// display login menu. and get username and password
	public void displayLogin()  {
		try {
			controller.loadFromFile();
		} catch (IOException e) {
			System.out.println("loadfromfile failed");
			e.printStackTrace();
		}
		Scanner in = new Scanner(System.in);
		System.out.println("Username:");
		username = in.nextLine();
		System.out.println("Password:");
		password = in.nextLine();

	}

	public void displayStudentMenu() {
		System.out.println("Welcome " + name);
		Scanner in = new Scanner(System.in);
		System.out.println("1. Register a course");
		System.out.println("2. View course information");
		System.out.println("3. View grades");
		System.out.println("4. Logout");
		option = in.nextInt();

	}

	public void displayInstructorMenu() {
		System.out.println("Welcome " + name);
		Scanner in = new Scanner(System.in);
		System.out.println("1. View assigned courses");
		System.out.println("2. View course information");
		System.out.println("3. View TA assignment");
		System.out.println("4. Logout");
		option = in.nextInt();
	}
	
/*	public void instructorViewCourseInfo(){
		// EFFECTS: returns list of courses instructor is currently assigned to teach
		ArrayList<String> ilist = intsAccount.getAssignedCourses();
		System.out
				.println("You are currently teaching in the following courses:");
		for (String s : clist) {
			System.out.println(s);
		}
	}*/

	// get account from database, if exists return true else return false
	public boolean getAccount(Account account) {
		Account ac = controller.getAccount(account);
		if (ac instanceof StudentAccount && ac != null) {
			name = ac.getName();
			isStudent = true;
			studAccount = (StudentAccount) ac;
			return true;
		}

		if (ac instanceof InstructorAccount && ac != null) {
			isInstructor = true;
			intsAccount = (InstructorAccount) ac;
			return true;
		}
		System.out.println("User not found");
		return false;
	}

}
