import java.util.Locale;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // ENTRADA DAS NOTAS
        float n1 = sc.nextFloat();
        float n2 = sc.nextFloat();
        float n3 = sc.nextFloat();

        // CÁLCULO DA MÉDIA
        float mediaFinal = (n1 + n2 + n3) / 3;

        if (mediaFinal >= 7.0f) {
            System.out.println("Aprovado");
        }

        else if (mediaFinal >= 5.0f && mediaFinal <= 6.9f) {
            System.out.println("Recuperação");
        }

        else {
            System.out.println("Reprovado");
        }

        sc.close();
    }
}
