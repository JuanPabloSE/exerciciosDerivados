import java.util.Scanner;

public class Fibonacci {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número/termo: ");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int proximo = a + b;
            a = b;
            b = proximo;
        }

        sc.close();
    }
}
