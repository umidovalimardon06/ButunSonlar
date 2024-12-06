import java.util.Scanner;
// Umidov Alimardon.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int son;

        while (true) {
            System.out.print("3-xonali sonni kiriting:");
            son = in.nextInt();
            if (son>99 && son<1000) {
                break;
            }
            System.out.println("Musbat va 3 xonali bo'lsin!");
        }

        System.out.println("Birliklar xonasi: "+(son%10));
        System.out.println("O'nliklar xonasi: "+(son/10%10));

    }


}