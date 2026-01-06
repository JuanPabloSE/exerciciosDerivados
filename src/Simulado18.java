import java.util.Locale;
import java.util.Scanner;

public class Simulado18 {
    public static void main (String [] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int contador = 0;

        while (N != 0){
            if (N > 0 && N % 7 == 0){
                contador++;
            }
            N = sc.nextInt();
        }

        System.out.println(contador);

        sc.close();
    }
}
