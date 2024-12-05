import java.util.Scanner;
// Umidov Alimardon //
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int A,B ;
        
        while (true) {

            System.out.print("A:");
            A = Math.abs(in.nextInt());
            System.out.print("B:");
            B = Math.abs(in.nextInt());

            if (A>B) {
                break;
            }
            System.out.println("A>B bo'lishi zarur!!!");
        }

        System.out.println("Ortib qolgan joy: "+(A%B));





    }
}