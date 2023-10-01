import java.util.Scanner;

public class VucutKitleIndeksi {
    public static void main(String args[]) {
      System.out.println("Vucut kitle indeksi");
      int kilo;
      double indeks, boy;
      Scanner input = new Scanner(System.in);
      System.out.println("Boyunuzu metre cinsinden giriniz ");
      boy = input.nextDouble();
      System.out.println("Kilonuzu giriniz ");
      kilo = input.nextInt();
      
      indeks = kilo / boy * boy;
      
      System.out.println("Indeksiniz : "+ indeks);
    }
}