import java.util.Scanner;

public class Exponential {
    public static void main(String[] args) {
        int sonuc = Exponential.exponent();
        System.out.println(sonuc);
    }
    public static int exponent() {
        Scanner in = new Scanner(System.in);
        System.out.println("Taban degerini giriniz :");
        int base = in.nextInt();
        System.out.println("Üs değerini giriniz :");
        int expon = in.nextInt();
        int son = 1;
        for (int i= 1; i<= expon;i++) {
            son = base* son;
        }
        return son;
    }
}
