package intro;

public class Main {

	public static void main(String[] args) {

		String internetSubeButonu = "İnternet Şubesi";
		double dolarDun = 8.18;
		double dolarBugun = 8.18;

		System.out.println(internetSubeButonu);

		if (dolarBugun < dolarDun) {
			System.out.println("Dolar Düştü resmi");
		} else if (dolarBugun > dolarDun) {
			System.out.println("Dolar Yükseldi resmi");
		} else {
			System.out.println("Dolar Eşittir resmi");
		}

		String kredi1 = "Hızlı Kredi";
		String kredi2 = "Mutlu Emekli Kredi";
		String kredi3 = "Konut Kredi";
		String kredi4 = "Çiftçi Kredi";
		String kredi5 = "Msb Kredi";

		System.out.println(kredi1);
		System.out.println(kredi2);
		System.out.println(kredi3);
		System.out.println(kredi4);
		System.out.println(kredi5);

		String[] krediler = { "Hızlı Kredi", "Mutlu Emekli Kredi", "Konut Kredi", "Çiftçi Kredi", "Msb Kredi",
				"Kültür Bakanlığı Kredisi"

		};

		for (String kredi : krediler) {
			System.out.println(kredi);
		}

		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}

		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2;
		sayi2 = 100;
		System.out.println(sayi1);

		int[] sayilar1 = { 1, 2, 3, 4, 5 };
		int[] sayilar2 = { 10, 20, 30, 40, 50 };
		sayilar1 = sayilar2;
		sayilar2[0] = 100;
		System.out.println(sayilar1[0]);

		String sehir1 = "Ankara";
		String sehir2 = "İstanbul";
		sehir1 = sehir2;
		sehir2 = "İzmir";
		System.out.println(sehir1);
	}

}
