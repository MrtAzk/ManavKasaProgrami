import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        //Değişkenler atandı
        double armutFiyat = 2.14;
        double elmaFiyat =3.67;
        double domatesFiyat=1.11;
        double muzFiyat = 0.95;
        double patlicanFiyat = 5.00;

        Scanner scanner = new Scanner(System.in);
        //Kullacıdan input alınıyor
        System.out.println("Armut Kaç Kilo ? : ");
        int armutKilo = scanner.nextInt();

        System.out.println("Elma Kaç Kilo ? : ");
        int elmaKilo=scanner.nextInt();

        System.out.println("Domates Kaç Kilo ? : ");
        int domatesKilo=scanner.nextInt();

        System.out.println("Muz Kaç Kilo ? : ");
        int muzKilo=scanner.nextInt();

        System.out.println("Patlıcan Kaç Kilo ? : ");
        int patlicanKilo=scanner.nextInt();
        //Toplam Fiyat hesaplama
        double toplamFiyat = (armutFiyat * armutKilo) +
                (elmaFiyat * elmaKilo) +
                (domatesFiyat * domatesKilo) +
                (muzFiyat * muzKilo) +
                (patlicanFiyat * patlicanKilo);

        System.out.println("Toplam Tutar : "+toplamFiyat+ "TL");

        scanner.close();

    }
}
