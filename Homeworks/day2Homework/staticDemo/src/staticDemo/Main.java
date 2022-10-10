package staticDemo;

public class Main {

	public static void main(String[] args) {
		ProductManager manager = new ProductManager();
		Product product = new Product();
		product.name="Nike";
		product.price=1069;
		product.id=1;
		manager.add(product);
	}

}
