import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
       int sayi;
       int toplam = 0 ;
       Scanner imp = new Scanner(System.in);
       System.out.println("Please enter the number: ");
       sayi= imp.nextInt();
       for (int i=1 ; i<sayi; i++){
           if (sayi%i==0){
               toplam=i+toplam;
           }
       }
       if (toplam==sayi){
           System.out.println("This is a perfect number.");
       }
       else
           System.out.println("This is not a perfect number.");
    }
}
