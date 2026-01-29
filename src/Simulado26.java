import java.util.Locale;
import java.util.Scanner;

public class Simulado26 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigoUm = sc.nextInt();
        int numeroUm = sc.nextInt();
        double valorUm = sc.nextDouble();

        int codigoDois = sc.nextInt();
        int numeroDois = sc.nextInt();
        double valorDois = sc.nextDouble();

        double soma1 = numeroUm * valorUm;
        double soma2 = numeroDois * valorDois;
        double valorTotal = soma1 + soma2;

        System.out.printf("VALOR A PAGAR = R$ %.2f%n", valorTotal);

        sc.close();
    }
}
