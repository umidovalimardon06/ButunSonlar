import java.util.Scanner;
// Umidov Alimardon //
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int bayt,kilobayt;

        System.out.print("Bayt:");
        bayt = Math.abs(in.nextInt());

        kilobayt = bayt/1024;
        System.out.println("Natija: "+kilobayt+" kb");



    }
}