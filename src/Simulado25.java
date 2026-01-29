import java.util.Locale;
import java.util.Scanner;

public class Simulado25 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();
        int horas = sc.nextInt();
        double salario = sc.nextDouble();

        double salarioCalculado = salario * horas;
        System.out.println("NUMBER = " + numero);
        System.out.printf("SALARY = U$ %.2f%n", salarioCalculado);

        sc.close();
    }
}
