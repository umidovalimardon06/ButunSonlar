import java.util.Scanner;
// Umidov Alimardon.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n,xona1,xona2,xona3;

        while (true) {

            System.out.print("Uch xonali musbat son kiriting:");
            n = in.nextInt();

            if (n < 1000 && n >99) {
                System.out.println("qabul qilindi☑️");
                break;
            }
            System.out.println("To'g'ri kelmaydi, qaytadan uruning!");
        }

        xona1 = n/100;
        xona2 = n/10%10;
        xona3 = n%10;

        System.out.println("Teskarisi: "+xona3+xona2+xona1);

    }
}