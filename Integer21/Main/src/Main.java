import java.util.Scanner;
// Umidov Alimardon.
class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int sekund ;

        while (true) {

            System.out.print("Kun boshidan boshlab o'tgan sekund:");
            sekund = in.nextInt();

            if (sekund>=0) {
                break;
            }
            System.out.println("manfiy bo'lishi mumkun emas!");
        }

        System.out.println("Kun boshidan "+(sekund/60) +" minut, "+(sekund%60)+" sekund o'tdi.");

    }
}