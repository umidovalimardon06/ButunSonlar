import java.util.Scanner;
// Umidov Alimardon.
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n;

        while (true) {
            System.out.print("999 dan katta son kiriting:");
            n = in.nextInt();
            if (n>999) {
                break;
            }
            System.out.println("999 dan katta son emas!");
        }

        System.out.println("Minglar xonasidagi son: "+ (n/1000) );

    }
}