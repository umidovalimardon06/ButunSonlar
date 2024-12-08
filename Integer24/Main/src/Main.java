import java.util.Scanner;
// Umidov Alimardon
public class Main {
    // K haftaning qaysi kuniga tog'ri kelishini topuvchi dastur
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int K;
        System.out.print("1~365 oralig'ida son kiriting:");
        K = in.nextInt();

        switch(K%7) {
            case 0:
                System.out.println("Yakshanba");
                break;
            case 1:
                System.out.println("Dushanba");
                break;
            case 2:
                System.out.println("Seshanba");
                break;
            case 3:
                System.out.println("Chorshanba");
                break;
            case 4:
                System.out.println("Payshanba");
                break;
            case 5:
                System.out.println("Juma");
                break;
            case 6:
                System.out.println("Shanba");
                break;
        }
    }
}