import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       int n,total = 0,counter = 0;
       Scanner inp = new Scanner(System.in);

       System.out.print("Lütfen Sınır Sayısını Giriniz: ");
       n = inp.nextInt();
       /*
       for (int i = 1;i < n; i*=2){
           System.out.println(i);
           total+=i;
       }System.out.println("Sayıların Toplamı: "+total);

*/
        System.out.print("Dördün Katları: ");
      for (int i = 1; i < n; i *= 4){
          System.out.print( i +", " );
      }
        System.out.println();
        System.out.print("Beşin katları: ");
      for (int j = 1; j < n; j *= 5){
          System.out.print(j +", ");
      }

    }




}