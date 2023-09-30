import java.util.Scanner;

public class areacalculator {
    public static void main(String[] args) {

        int taban, yukseklik, alan;



        Scanner input = new Scanner(System.in);

        System.out.println("Taban Giriniz : ");
        taban = input.nextInt();
        System.out.println("Yukseklik Giriniz : ");
        yukseklik = input.nextInt();

        alan = taban * yukseklik / 2;

        System.out.println("Alan = " + alan);
    }
}
