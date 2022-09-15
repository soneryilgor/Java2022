package javadenemeler;

public class arrayDemos {

	public static void main(String[] args) {
		String ogrenci1 = "Engin";
		String ogrenci2 = "Derin";
		String ogrenci3 = "Salih";
		String ogrenci4 = "Ahmet"; 
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);
		
		System.out.println("-----------------------");
		
		String[] ogrenciler = new String[4];
		ogrenciler[0]="Engin";
		ogrenciler[1]="Derin";
		ogrenciler[2]="Salih";
		ogrenciler[3]="Ahmet";
		
		for (int i=0; i<ogrenciler.length; i++) {
			
		System.out.println(ogrenciler[i]);
		}
		
		System.out.println("-----------------------");
		
		
		String[] ogrenciler1 = {"Engin1","Derin1","Salih1","Ahmet1"};
		
		for (int i=0; i<ogrenciler1.length; i++) {
			
		System.out.println(ogrenciler1[i]);
		}
		
		System.out.println("-----------------------");
		
		for(String ogrenci:ogrenciler) {
			
		System.out.println(ogrenci);
			
		}
		
	}

}
