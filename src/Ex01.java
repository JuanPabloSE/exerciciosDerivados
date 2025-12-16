import java.util.Locale;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        if (N > 0 && N % 2 == 0) {
            System.out.println("POSITIVO PAR");
        }

        else if (N > 0 && N % 2 != 0) {
            System.out.println("POSITIVO IMPAR");
        }

        else if (N < 0 && N % 2 == 0) {
            System.out.println("NEGATIVO PAR");
        }

        else if (N < 0 && N % 2 != 0) {
            System.out.println("NEGATIVO IMPAR");
        }

        else {
            System.out.println("ZERO");
        }

        sc.close();
    }
}
