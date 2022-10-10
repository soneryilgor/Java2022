package classeseWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		product.setName("Laptop");
		product.setId(1);
		product.setDescription("Asus Laptop");
		product.setPrice(5000);
		product.setStockAmount(3);
		
		/*System.out.println(product.name);
		System.out.println(product.id);
		System.out.println(product.description);
		System.out.println(product.price);
		System.out.println(product.stockAmount);*/
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);  

	}

}
