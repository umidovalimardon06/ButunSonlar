import java.util.Scanner;
// Umidov Alimardon
public class Main {
    // Ikkixonali son raqamlari yig'indisini aniqloovchi dastur.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int son;

        while (true) {
            System.out.print("Ikki xonali son kiriting:");
            son = in.nextInt();
            if (son>-99 && son<100  && !(son>=-9 && son<=9) ) {
                System.out.println("qabul qilindi☑️");
                break;
            }
            System.out.println("Ikki xonali emas qaytadan uruning!");
        }


        System.out.println("Raqamlari yig'indisi: "+((son/10)+(son%10)));




    }
}