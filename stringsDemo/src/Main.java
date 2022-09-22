public class Main {

    public static void main(String[] args) {
        String mesaj= "Bugün Hava Çok Güzel..";
        System.out.println(mesaj);

        System.out.println("Eleman sayısı : "+mesaj.length());
        System.out.println("5.eleman : "+mesaj.charAt(4));
        System.out.println(mesaj.concat(" Yaşasın!"));
        System.out.println(mesaj.startsWith("B"));
        System.out.println(mesaj.endsWith("."));
        char[] karakterler=new char[5];
        mesaj.getChars( srcBegin:0, srcEnd:5, karakterler, dstBegin:0);
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf("av"));

        String yeniMesaj=mesaj.replace( oldChar:' ', newChar: '-');
        System.out.println(yeniMesaj);
        System.out.println(mesaj.substring(2,5));

        for(String kelime: mesaj.split(regex: " ")){
            System.out.println(kelime);
        }
        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());
        System.out.println(mesaj.trim());
    }
}
