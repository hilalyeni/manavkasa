import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00;
        Scanner input = new Scanner(System.in);
        System.out.print("Armut kaç kilo? ");
        double a = input.nextDouble();
        System.out.print("Elma kaç kilo? ");
        double e = input.nextDouble();
        System.out.print("Domates kaç kilo? ");
        double d = input.nextDouble();
        System.out.print("Muz kaç kilo? ");
        double m = input.nextDouble();
        System.out.print("Patlıcan kaç kilo? ");
        double p = input.nextDouble();
        double total = ((armut * a) + (elma * e) + (domates * d) + (muz * m) + (patlican * p));
        System.out.println("Toplam Tutar: " + total + "TL");


    }
}