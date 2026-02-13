import java.util.Scanner;

public class FuncoesSintaxe01 {

    // FUNÇÃO 01
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 3 números inteiros: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        int lowest = min(x, y, z);

        mostreResultado(lowest);

        sc.close();
    }

    // FUNÇÃO 02
    public static int min(int a, int b, int c){
        int aux; // VARIÁVEL AUXILIADORA - RECEBERÁ O RESULTADO E RETORNARÁ.
        if (a < b && a < c){
            aux = a;
        }
        else if (b < c){
            aux = b;
        }
        else {
            aux = c;
        }
        return aux;
    }

    // FUNÇÃO 03 - MOSTRAR NA TELA
    public static void mostreResultado(int valor){
        System.out.print("Lowest = " + valor);
    }

}
