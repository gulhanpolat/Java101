import java.util.Scanner;

public class Recursive_N {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("N sayısı giriniz :");
        int N = in.nextInt();
        pattern(N);

    }
    static void pattern(int num) {
        if (num <= 0) {
            System.out.print(num + " ");
            return;
        } else {
            System.out.print(num + " ");
            num -= 5;
            pattern(num); 
            num += 5;
            System.out.print(num + " ");
        }
    }

}
