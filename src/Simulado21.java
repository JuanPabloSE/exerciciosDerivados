import java.util.Locale;
import java.util.Scanner;

public class Simulado21 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int maior = N;
        int menor = N;

        while (N != 0) {
            if (N > maior) {
                maior = N;
            }
            if (N < menor) {
                menor = N;
            }

            N = sc.nextInt();
        }

        System.out.println(menor);
        System.out.println(maior);

        sc.close();
    }
}
