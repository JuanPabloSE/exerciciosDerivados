import java.util.Locale;
import java.util.Scanner;

public class Ex05 {
    public static void main (String [] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int entrada = sc.nextInt();
        int cem, cinquenta, vinte, dez, cinco, dois, um, resto;

        // NOTAS DE R$ 100
        cem = entrada / 100;
        resto = entrada % 100;

        // NOTAS DE R$50
        cinquenta = resto / 50;
        resto = resto % 50;

        // NOTAS DE R$20
        vinte = resto / 20;
        resto = resto % 20;

        // NOTAS DE R$10
        dez = resto / 10;
        resto = resto % 10;

        // NOTAS DE R$5
        cinco = resto / 5;
        resto = resto % 5;

        // NOTAS DE R1$
        dois = resto / 2;
        um = resto % 2; // RESTO SÃO AS NOTAS DE 1 REAL.

        System.out.println(entrada);
        System.out.printf("%d nota(s) de R$ 100%n", cem);
        System.out.printf("%d nota(s) de R$ 50%n", cinquenta);
        System.out.printf("%d nota(s) de R$ 20%n", vinte);
        System.out.printf("%d nota(s) de R$ 10%n", dez);
        System.out.printf("%d nota(s) de R$ 5%n", cinco);
        System.out.printf("%d nota(s) de R$ 2%n", dois);
        System.out.printf("%d nota(s) de R$ 1%n", um);


        sc.close();
    }
}
