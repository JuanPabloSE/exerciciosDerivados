import java.util.Locale;
import java.util.Scanner;

public class Simulado03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int soma = 0;
        while (N != 0) {
            if (N > 0 && N % 2 != 0) {
                soma += N;
            }
            N = sc.nextInt();
        }

        System.out.println(soma);

        sc.close();
    }
}
