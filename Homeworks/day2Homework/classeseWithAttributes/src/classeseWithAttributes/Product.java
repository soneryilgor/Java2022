package classeseWithAttributes;

public class Product {
	private int id;
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	private String renk;
	private int getId() {
		return id;
	}
	void setId(int id) {
		this.id = id;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	private String getDescription() {
		return description;
	}
	void setDescription(String description) {
		this.description = description;
	}
	private double getPrice() {
		return price;
	}
	void setPrice(double price) {
		this.price = price;
	}
	private int getStockAmount() {
		return stockAmount;
	}
	void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}
	private String getRenk() {
		return renk;
	}
	private void setRenk(String renk) {
		this.renk = renk;
	}
}
