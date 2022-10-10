package staticDemo;

public class ProductManager {
	public void add(Product prudoct) {
		
		if (ProductValidator.isValid(prudoct)) {
			System.out.println("Urun Eklendi");
		}else {
			System.out.println("Urun bilgileri gecersizdir!");
		}
	}
}
