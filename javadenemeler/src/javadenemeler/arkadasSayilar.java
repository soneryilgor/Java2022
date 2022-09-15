package javadenemeler;

public class arkadasSayilar {

	public static void main(String[] args) {
		//220-284
		int sayi1=220;
		int sayi2=284;
		int total1=0;
		int total2=0;
		
		for(int i=1; i<sayi1; i++) {
			if(sayi1 % i==0)
			total1=total1+i;
		}
		
		for(int i=1; i<sayi2; i++) {
			if(sayi2 % i==0)
			total2=total2+i;
		}
		
		if(sayi1==total2 && sayi2==total1) {
			System.out.println("Sayilar arkadas sayilardir");
		}else {
			System.out.println("Sayilar arkadas sayi degildir");
		}
	}

}
