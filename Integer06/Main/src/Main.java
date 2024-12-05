import java.util.Scanner;
// Umidov Alimardon
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int ikkixonalison;

        System.out.print("Ikki xonali sonni kiriting:");
        ikkixonalison = Math.abs(in.nextInt());

        System.out.println("O'nlik xonasidagi son: "+(ikkixonalison/10));
        System.out.println("Birlik xonasidagi son: "+(ikkixonalison%10));



    }
}