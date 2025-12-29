import java.util.Locale;
import java.util.Scanner;

public class Simulado15 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int quantidade = 0;

        while (N != 0) {
            if (N > 0 && N % 4 == 0) {
                quantidade++;
            }
            N = sc.nextInt();
        }

        System.out.println(quantidade);

        sc.close();
    }
}
