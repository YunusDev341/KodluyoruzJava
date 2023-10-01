

import java.util.Scanner;

class manavhesaplayici {
    public static void main(String[] args) {
        double armut, elma, domates, muz, patlican;
        double armutK, elmaK, domatesK, muzK, patlicanK;
        double a, e, d, m, p, toplam;
        
        
        
        armut = 2.14;
        elma = 3.67;
        domates = 1.11;
        muz = 0.95;
        patlican = 5.00;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("armudun kilosunu giriniz " );
        armutK = input.nextDouble();
        
        a = armut * armutK;
        
        System.out.println("elmanin kilosunu giriniz ");
        elmaK = input.nextDouble();
        
        e = elma * elmaK;
        
        System.out.println("patlicanin kilosunu giriniz");
        patlicanK = input.nextDouble();
        
        p = patlican * patlicanK;
        
        
        System.out.println("muzun kilosunu giriniz");
        muzK = input.nextDouble();
        
        m = muz * muzK;
        
        System.out.println("domatesin kilosunu giriniz");
        domatesK = input.nextDouble();
        
        d = domates * domatesK;
        
        toplam = a + e + d + m + p;
        
        System.out.println("Toplam : "+ toplam);
        
        
        
        
        
       
        
    }
}