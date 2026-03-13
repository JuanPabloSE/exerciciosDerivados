import java.util.Scanner;

public class Simulado27 {
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);

        int valor = lerValor(sc, "Valor de entrada: ");
        calcularValor(valor);

        sc.close();

    }

    public static int lerValor(Scanner sc, String mensagem) {
        System.out.print(mensagem);
        return sc.nextInt();
    }

    public static void calcularValor(int valor) {
        for (int i = 0; i < valor; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

}
