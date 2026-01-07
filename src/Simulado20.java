import java.util.Locale;
import java.util.Scanner;

public class Simulado20 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int anterior = sc.nextInt(); // primeiro número
        int contador = 1;            // ele já é válido

        while (true) {
            int atual = sc.nextInt();

            if (atual <= anterior) {
                break; // quebra da sequência
            }

            contador++;
            anterior = atual;
        }

        System.out.println(contador);

        sc.close();
    }
}
