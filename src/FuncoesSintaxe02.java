import java.util.Locale;
import java.util.Scanner;

public class FuncoesSintaxe02 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 3 notas: ");
        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();
        double nota3 = sc.nextDouble();

        double mediaFinal = media(nota1, nota2, nota3);
        String situacaoAluno = situacao(mediaFinal);
        double diferenca = diferencaAprovacao(mediaFinal);

        showResultado(mediaFinal, situacaoAluno, diferenca);

        sc.close();
    }

    public static double media(double n1, double n2, double n3) {
        double resultadoMedia = (n1 + n2 + n3) / 3.0;
        return resultadoMedia;
    }

    public static String situacao(double mediaFinal) {
        String resultado;
        if (mediaFinal >= 7.0) {
            resultado = "Aprovado";
        }
        else if (mediaFinal >= 5.0) {
            resultado = "Recuperação";
        }
        else {
            resultado = "Reprovado";
        }
        return resultado;
    }

    public static double diferencaAprovacao(double mediaFinal) {
        if (mediaFinal >= 7.0) {
            return 0.0;
        }
        else {
            return 7.0 - mediaFinal;
        }
    }

    public static void showResultado(double mediaFinal, String situacaoAluno, double diferenca) {
        System.out.printf("Media Final: %.1f%n", mediaFinal);
        System.out.println("Situacao: " + situacaoAluno);

        if (diferenca > 0.0) {
            System.out.printf("Faltaram %.1f pontos para aprovação.", diferenca);
        }

    }

}
