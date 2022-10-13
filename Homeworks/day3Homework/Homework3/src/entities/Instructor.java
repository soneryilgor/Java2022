package entities;

public class Instructor extends Base{
	
	private int instructorNumber;
	private String Lastname;
	
	public Instructor() {
	}

	public Instructor(int id, int instructorNumber,String name, String lastname) {
		this.instructorNumber = instructorNumber;
		this.Lastname = lastname;
		
	}

	public int getInstructorNumber() {
		return instructorNumber;
	}

	public void setInstructorNumber(int instructorNumber) {
		this.instructorNumber = instructorNumber;
	}

	public String getLastname() {
		return Lastname;
	}

	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	
	
	
}
