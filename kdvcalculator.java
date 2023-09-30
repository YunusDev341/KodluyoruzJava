import java.util.Scanner;

public class kdvcalculator {
    public static void main(String[] args) {
        double tutar, kdvOran = 0.18;
        Scanner input = new Scanner(System.in);
        System.out.println("Ucret tutarını giriniz");
        tutar = input.nextDouble();
        double kdvTutar = tutar * kdvOran;
        double kdvliTutar = tutar + kdvTutar;
        System.out.println("Kdv Orani : " + kdvOran);
        System.out.println("Kdv Tutari : " + kdvTutar);
        System.out.println("Kdv'li Tutari : " + kdvliTutar);
    }
}
