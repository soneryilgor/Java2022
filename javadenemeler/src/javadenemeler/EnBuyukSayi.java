package javadenemeler;

public class EnBuyukSayi {

	public static void main(String[] args) {
		int sayi1 = 27;
		int sayi2 = 35;
		int sayi3 = 30;

		int enBuyuk = sayi1;

		if (enBuyuk < sayi2) {
			enBuyuk = sayi2;
		}
		if (enBuyuk < sayi3) {
			enBuyuk = sayi3;
		}

		System.out.println("En büyük sayı: " + enBuyuk);

	}

}
