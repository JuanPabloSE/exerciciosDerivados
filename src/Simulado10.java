import java.util.Locale;
import java.util.Scanner;

public class Simulado10 {
    public static void main (String [] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int soma = 0;

        for (int i = 1; i <= N; i++){
            if(i % 3 == 0 || i % 5 == 0){
                soma += 1;
            }
        }

        System.out.println(soma);

        sc.close();
    }
}
