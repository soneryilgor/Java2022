package javadenemeler;

public class sesliHarfler {

	public static void main(String[] args) {
		char harf = 'e';
		char sesli[] = {'a','e','i','o','u'};
				
		//System.out.println(sesli[3]);
		
		for (int i=0; i<sesli.length; i++) {
			if(harf == sesli[i]) {
				System.out.println("Harf Seslidir");
				return;
			}
			if (harf != sesli[i]) {
				System.out.println("Harf Sesli degildir");
				
			}
			
		}
	}

}
