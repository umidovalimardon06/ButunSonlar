import java.util.Scanner;
// Umidov Alimardon
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int son,xona1,xona2;



         while (true) {
             System.out.print("Ikki xonali sonni kiriting:");
             son = in.nextInt();
             if (son>9 && son<100) {
                 System.out.println("qabul qilindi☑️");
                 break;
             }
             System.out.println("Ikki xonali(musbat) son kiriting!!!");
         }

         xona1 = son/10;
         xona2 = son%10;

        System.out.println("Xonalari almashgan xholati: "+xona2+xona1);


    }
}