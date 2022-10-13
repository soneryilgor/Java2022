package entities;

public class Student extends Base{
	private int studentNumber;
	private String lastName;
	
	public Student() {
	}

	public Student(int id ,int studentNumber,String name,String lastName) {
		this.studentNumber = studentNumber;
		this.lastName = lastName;
		
	}

	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}
