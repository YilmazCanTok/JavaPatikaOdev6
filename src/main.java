
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayı;
        int toplam = 0;
        int mod;
        int basamaksayisi = 0;
        System.out.println("****************************************************");
        System.out.println("Verilen Sayının Basamak Değerlerini Toplayan Program: ");
        System.out.println("----------------------------------------------------");
        System.out.print("Lütfen Bir Sayı Giriniz : ");
        sayı = scanner.nextInt();
        while (sayı != 0) { 
            mod = sayı%10;
            sayı = sayı/10;
            basamaksayisi++;
            toplam = toplam+mod;
        }
        System.out.println("----------------------------------------------------");
        System.out.println("Toplam : "+toplam);
        System.out.println("****************************************************");
    }
}
