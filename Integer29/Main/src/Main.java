import java.util.Scanner;
// Umidov Alimardon.
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int A,B,C ;

        while (true) {
            System.out.print("A:");
            A = in.nextInt();
            System.out.print("B:");
            B = in.nextInt();
            System.out.print("C:");
            C = in.nextInt();

            if (A>0 && B>0 && C>0) {
                System.out.println("Qabul qilindi☑️");
                break;
            }
            System.out.println("Qaysigadir manfiy son berildi.");
        }


        System.out.println("Ortqib qolgan joy: "+(A*B%C*C));

    }
}