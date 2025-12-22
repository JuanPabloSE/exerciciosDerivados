import java.util.Locale;
import java.util.Scanner;

public class Simulado07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        while (N != 0) {
            if (N % 2 == 0) {
                System.out.println("PAR");
            }
            else {
                System.out.println("IMPAR");
            }
            N = sc.nextInt();
        }

        sc.close();
    }
}
