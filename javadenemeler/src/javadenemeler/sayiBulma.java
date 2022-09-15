package javadenemeler;

public class sayiBulma {

	public static void main(String[] args) {
		int[] sayilar = {1,3,5,7,9,0};
		int aranacak = 5;

		for (int i = 0; i > sayilar.length; i++) {
			if (aranacak == sayilar[i]) {
				System.out.println("Aranan sayi sayilar icinde var");
			}else {
				System.out.println("Aranan sayi sayilar icinde yoktur!");
			}
		}

	}

}
