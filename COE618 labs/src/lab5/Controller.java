package lab5;

import java.io.IOException;
import java.util.ArrayList;

public class Controller {
	
	private Database db;
	
	public Controller(){
		db = new Database();
	}
	
	public Account getAccount(Account account){
		return db.getAccount(account);	
	}	
	
	//Put some accounts into database
	public void addAccounts(){
		ArrayList<String> courses1 = new ArrayList<> ();
		courses1.add("COE 318");courses1.add("ELE 302");courses1.add("MTH 312");courses1.add("COE 328");
		ArrayList<String> grades1 = new ArrayList<> ();
		grades1.add("CEN 100 - A+");grades1.add("CEN 199 - A");grades1.add("CHY 102 - B");grades1.add("MTH 140 - C");
		Account student1 = new StudentAccount("David Natta","user1","pass1",courses1,grades1);
		db.addAccount(student1);
		
		ArrayList<String> courses2 = new ArrayList<> ();
		courses2.add("COE 700");courses2.add("COE 758");courses2.add("COE 768");courses2.add("ENG 503");
		ArrayList<String> grades2 = new ArrayList<> ();
		grades2.add("COE 800 - A+");grades2.add("CEN 800 - A");grades2.add("HST 701 - B");grades2.add("GEO702 - C");
		Account student2 = new StudentAccount("Ronald Tsang","user2","pass2",courses2,grades2);
		db.addAccount(student2);
		
		ArrayList<String> courses3 = new ArrayList<> ();
		courses3.add("COE 318");courses3.add("ELE 302");courses3.add("MTH 312");courses3.add("COE 328");
		ArrayList<String> grades3 = new ArrayList<> ();
		grades3.add("CEN 100 - A+");grades3.add("CEN 199 - A");grades3.add("CHY 102 - B");grades3.add("MTH 140 - C");
		Account student3 = new StudentAccount("Naimul Merfaz Khan","user3","pass3",courses3,grades3);
		db.addAccount(student3);
		
		
		
	}

	public String[] getCourseEnrollmentList() {
		String [] enrollment = {"CMN 432","COE 428","ELE 401","ELE 404","MTH 314"};
		return enrollment;
	}

	public void updateAccount(StudentAccount studAccount) {
		db.updateAccount(studAccount);
	}
	
	public void saveToFile() throws IOException {
		db.saveToFile();
	}
	
	public void loadFromFile() throws IOException {
		db.loadFromFile();
	}

	

}
