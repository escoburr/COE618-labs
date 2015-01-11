package lab5;

import java.util.Arrays;
import java.util.HashMap;

public class InstructorAccount extends Account {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7847394244549184894L;
	private String courseList[]; //list of courses assgined
	private HashMap<String,String> studentGrade;
	private String taAssignment;

	public InstructorAccount(String name,String username, String password,
			String[] courseList, HashMap<String, String> studentGrade, String taAssignment) {
		super(username, password,name);
		this.courseList = courseList;
		this.studentGrade = studentGrade;
		this.taAssignment = taAssignment;
	}
	
	public String[] getAssignedCourses(){
		//returns list of courses Instructor is currently assigned to
		return courseList;
	}

	@Override
	public String toString() {
		return super.toString()+"InstructorAccount [courseList=" + Arrays.toString(courseList)
				+ ", courseInformation=" 
				+ ", studentGrade=" + studentGrade + ", taAssignment="
				+ taAssignment + "]";
	}
	
	
	
	
	
}
