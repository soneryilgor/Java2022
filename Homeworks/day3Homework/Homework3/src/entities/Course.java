package entities;

public class Course extends Base{
	
	private int courseNumber;
	private String info;
	private double unitPrice;
	private Category category;
	private Instructor instructor;
	
	public Course() {
	}

	public Course(int courseNumber, String info, double unitPrice, Category category, Instructor instructor) {
		super();
		this.courseNumber = courseNumber;
		this.info = info;
		this.unitPrice = unitPrice;
		this.category = category;
		this.instructor = instructor;
	}

	public int getCourseNumber() {
		return courseNumber;
	}

	public void setCourseNumber(int courseNumber) {
		this.courseNumber = courseNumber;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

	
}
