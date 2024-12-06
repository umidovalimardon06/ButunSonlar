import java.util.Scanner;
// Umidov Alimardon.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int son;  // Uch honali son.

        while (true) {
            System.out.print("3 xonali son kiriting:");
            son = in.nextInt();

            if (son>99 && son<1000) {
                break;
            }
            System.out.println("3 xonali va musbat emas!");
        }


        System.out.println("Yuzlar xonasidagi son: "+(son/100));

    }
}