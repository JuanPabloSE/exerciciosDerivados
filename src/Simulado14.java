import java.util.Locale;
import java.util.Scanner;

public class Simulado14 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int anterior = sc.nextInt();
        int atual = sc.nextInt();

        while (atual != 0){

            if (atual > anterior){
                System.out.println("CRESCENTE");
            }
            else {
                System.out.println("NAO CRESCENTE");
            }

            anterior = atual;
            atual = sc.nextInt();
        }

        sc.close();
    }
}
