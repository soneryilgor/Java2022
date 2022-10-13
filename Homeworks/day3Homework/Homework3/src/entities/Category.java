package entities;

public class Category extends Base{
	private int categoryNumber;
	private String info;
	
	public Category() {
	}

	public Category(int id,int categoryNumber,String name, String info) {
		this.categoryNumber = categoryNumber;
		this.info = info;
	}

	public int getCategoryNumber() {
		return categoryNumber;
	}

	public void setCategoryNumber(int categoryNumber) {
		this.categoryNumber = categoryNumber;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}
		
	
}
