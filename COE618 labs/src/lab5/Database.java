package lab5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Database {

	private File file = new File("C:\\StudentRegistryApp\\test.data");
	private ArrayList<Account> db;

	public Database() {
		db = new ArrayList<>();
	}

	public void addAccount(Account account) {
		//MODIFIEs: db : ArrayList<Account>
		//EFFECTS: adds account specified in argument to database.
		if (account instanceof StudentAccount) {
			StudentAccount student = (StudentAccount) account;
			db.add(student);
		}
		if (account instanceof InstructorAccount) {

		}
	}

	public void removeAccount() {

	}

	public Account getAccount(Account account) {
		//returns account specified otherwise returns null.
		int index;
		if ((index = db.indexOf(account)) >= 0) {
			return db.get(index);
		} else
			return null;
	}
	
	public ArrayList<StudentAccount> getListOfStudents(){
		//EFFECTS: returns list of all students currently registered on the system.
		ArrayList<StudentAccount> sa = new ArrayList<>();
		for (Account ac : db){
			if (ac instanceof StudentAccount){
				sa.add((StudentAccount)ac);
			}
		}
		return null;
	}
	public ArrayList<StudentAccount> getListOfStudents(String course){
		//EFFECTS: returns list of students who are currently enrolled in specified course. 
		ArrayList<StudentAccount> sa = new ArrayList<>();
		for (Account ac : db){
			if (ac instanceof StudentAccount){
				StudentAccount a = (StudentAccount) ac;
				for (String c : a.getEnrolledCourses()){
					if (course.equals(c)){
						sa.add((StudentAccount) ac);
					}
				}
			}
		}
		return null;
	}
	
	public StudentAccount getStudentAccount(String name){
		for (Account n : db){
			if (n.equals(name)){
				return (StudentAccount)n;
			}
		}
		return null;
	}

	public void saveToFile() throws IOException {
		// EFFECTS: save database object to file
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object.data"))){
			oos.writeObject(db);
			
		}catch (FileNotFoundException fnfe){
			System.err.println("Cannot create a file with the given file name");
			
		}catch(IOException ioe){
			System.err.println("an I/O error occurred while processing the file");
		}
		

	}

	@SuppressWarnings("unchecked")
	public void loadFromFile() throws IOException {
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.data"))){
			Object obj = ois.readObject();
			if (obj != null && obj instanceof ArrayList){
				db = (ArrayList<Account>) obj;
			}
		}catch (FileNotFoundException fnfe){
			System.err.println("cannot find given file name");
		}catch (IOException ioe){
			System.err.println(ioe.getMessage());
			System.err.println("an I/O eror occurred while processing the file");
		}catch (ClassNotFoundException cnfe){
			System.err.println("Cannot recognize class of the object - is the file corrupted?");
		}

	}

	public void updateAccount(StudentAccount studAccount) {
		int index = 0;
		String user = studAccount.getUsername();
		String pass = studAccount.getPassword();
		Account ac = new Account(user, pass);
		if ((index = db.indexOf(ac)) >= 0) {
			db.set(index, studAccount);
		} else {
			System.out.println("updateAccount failed");
		}
	}
}
