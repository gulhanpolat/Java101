import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        if(prime()== 0){
            System.out.println("ASALDIR");
        }else{
            System.out.println("Asal Değildir !");
        }
    }
    public static int prime(){
        Scanner in = new Scanner(System.in);
        System.out.println("Sayı giriniz :");
        int x = in.nextInt();
        int sonuc=0;
        for(int i =2; i< x ;i++){
            if(x%i==0){
                 sonuc =2;
            }
        }
        int sonuc1 = sonuc;
        return sonuc;
    }
}
