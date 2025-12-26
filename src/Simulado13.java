import java.util.Locale;
import java.util.Scanner;

public class Simulado13 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int soma = 0;

        while (soma < 100) {
            int N = sc.nextInt();
            soma += N;
        }

        System.out.println(soma);

        sc.close();
    }
}
