import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double km_ucreti,mesafe,tutar;
        Scanner girdi = new Scanner(System.in);
        System.out.println("km basına ucret ne kadar olsun lutfen gırınız: ");
        km_ucreti = girdi.nextDouble();
        System.out.println("Kac km lik mesafe için ücret hesaplanmasını ıstersınız? :");
        mesafe = girdi.nextDouble();
        tutar =km_ucreti * mesafe;
        System.out.println("taksimetre ücretiniz: " + tutar);

    }
}