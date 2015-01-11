package lab5;

import java.util.ArrayList;

public class StudentAccount extends Account{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8887570902673721331L;
	private ArrayList<String>enrolledCourses;//courses enrolled in
	private ArrayList<String> gradeList;
	
	public StudentAccount(String name, String username, String password,
			ArrayList<String> courseList, ArrayList<String> gradeList) {

		super(username, password,name);
		this.enrolledCourses = courseList;
		this.gradeList = gradeList;
	}

	public ArrayList<String> getEnrolledCourses() {
		return enrolledCourses;
	}

	public ArrayList<String> getGradeList() {
		return gradeList;
	}

	@Override
	public String toString() {
		return super.toString()+"StudentAccount [enrolledCourses=" + enrolledCourses
				+ ", gradeList=" + gradeList + "]";
	}
	
	
	
	
	

}
