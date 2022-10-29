package manav;
import java.util.Scanner;
public class Manav {
 public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     double arm=2.14;
     double elm=3.67;
     double dom=1.11;
     double mu=0.95;
     double pat=5.00;
     int armut,elma,domates,muz,patlican;
     System.out.println("Kaç kilo elma aldınız:");
     elma = input.nextInt();
     System.out.println("Kaç kilo muz aldınız:");
     muz = input.nextInt();
     System.out.println("Kaç kilo armut aldınız:");
     armut = input.nextInt();
     System.out.println("Kaç kilo patlıcan aldınız:");
     patlican = input.nextInt();
     System.out.println("Kaç kilo domates aldınız:");
     domates = input.nextInt();
     double toplam = ((elm*elma)+(arm*armut)+(dom*domates)+(mu*muz)+(pat*patlican));
     System.out.println("Toplam fiyat;" +toplam+"Tl" );
     System.out.print("\n İyi Günler");

 }


}
