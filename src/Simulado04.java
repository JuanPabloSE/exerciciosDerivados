import java.util.Locale;
import java.util.Scanner;

public class Simulado04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            if (i % 4 == 0 && i % 7 == 0) {
                System.out.println("PIMPAM");
            }
            else if (i % 4 == 0) {
                System.out.println("PIM");
            }
            else if (i % 7 == 0) {
                System.out.println("PAM");
            }
            else {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
