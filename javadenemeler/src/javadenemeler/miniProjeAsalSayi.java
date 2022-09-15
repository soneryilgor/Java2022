package javadenemeler;

public class miniProjeAsalSayi {

	public static void main(String[] args) {
		int number = 9;
		boolean isPrime = true;
		
		for(int i=2; i<number; i++) {
			if(number % i == 0) {
				isPrime=false;
			}
		}
		
		if (isPrime) {
			System.out.println("Sayi asaldir");
		}else {
			System.out.println("Sayi asal degildir");
		}
		
		

	}

}
