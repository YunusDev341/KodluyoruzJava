import java.util.Scanner;
public class NotHesaplayici {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ortalama Hesaplayicisina Hosgeldin");

        System.out.println("Ismini ve Soyismini Gir");
        String name = scanner.nextLine();
        System.out.println("Matematik Notunu Gir");
        int math  = scanner.nextInt();
        System.out.println("Fizik Notunu Gir");
        int physics = scanner.nextInt();
        System.out.println("Kimya Notunu Gir");
        int chemistry = scanner.nextInt();
        System.out.println("Turkce Notunu Gir");
        int turkish = scanner.nextInt();
        System.out.println("Tarih Notunu Gir");
        int history = scanner.nextInt();
        System.out.println("Muzik Notunu Gir");
        int music = scanner.nextInt();

        int total = (math + physics + chemistry + turkish + history + music);
        double ortalama = total / 6;

        System.out.println("Ortalaman" + ortalama);

        double passing_limit = 60.0;
        String sonuc;
        sonuc = (ortalama>=passing_limit) ? "Tebrikler ! " +name: "Bu dersi Tekrardan al"+name;

        System.out.println(sonuc);

    }
}
