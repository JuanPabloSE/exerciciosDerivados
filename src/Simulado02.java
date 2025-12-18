import java.util.Locale;
import java.util.Scanner;

public class Simulado02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        float nota1 =  sc.nextFloat();
        while (nota1 < 0 || nota1 > 10){
            System.out.println("nota invalida");
            nota1 = sc.nextFloat();
        }

        float nota2 =  sc.nextFloat();
        while (nota2 < 0 || nota2 > 10){
            System.out.println("nota invalida");
            nota2 = sc.nextFloat();
        }

        float mediaFinal = (nota1 + nota2) / 2;
        System.out.printf("media = %.1f%n", mediaFinal);

        sc.close();
    }
}
