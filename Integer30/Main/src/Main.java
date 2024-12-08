import java.util.Scanner;
// Umidov Alimardon
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int yil;

        System.out.print("Yilni kiriting:");
        yil = in.nextInt();

        System.out.println("Demak "+(yil/100+1)+" chi asr!");


    }
}