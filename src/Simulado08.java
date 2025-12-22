import java.util.Scanner;

public class Simulado08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N  = sc.nextInt();
        int soma = 0;

        while (N != 0) {

            if (N % 2 != 0 && N < 0) {
                soma += N;
            }

            N = sc.nextInt();
        }

        System.out.println(soma);

        sc.close();
    }
}
