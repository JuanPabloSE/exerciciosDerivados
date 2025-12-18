import java.util.Locale;
import java.util.Scanner;

public class Simulado05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int cem, cinquenta, vinte, dez, cinco, dois, resto;

        if(N <= 0 || N == 1 || N == 3) {
            System.out.println("Valor invalido");
        }

        else{
        cem = N / 100;
        resto = N % 100;

        cinquenta = resto / 50;
        resto = resto % 50;

        vinte = resto / 20;
        resto = resto % 20;

        dez = resto / 10;
        resto = resto % 10;

        cinco = resto / 5;
        resto = resto % 5;

        dois = resto / 2;

        System.out.printf("%d nota(s) de R$ 100%n", cem);
        System.out.printf("%d nota(s) de R$ 50%n", cinquenta);
        System.out.printf("%d nota(s) de R$ 20%n", vinte);
        System.out.printf("%d nota(s) de R$ 10%n", dez);
        System.out.printf("%d nota(s) de R$ 5%n", cinco);
        System.out.printf("%d nota(s) de R$ 2%n", dois);}

        sc.close();
    }
}
