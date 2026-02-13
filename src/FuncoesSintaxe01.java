import java.util.Scanner;

public class FuncoesSintaxe01 {

    // FUNÇÃO 01
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 3 números inteiros: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        int higher = max(x,y,z);
        int lowest = min(x, y, z);
        int resultadoDiferenca = diferenca(higher, lowest);

        showResult(resultadoDiferenca);

        sc.close();
    }

    // FUNCÃO 02 - MAIOR NÚMERO
    public static int max(int a, int b, int c){
        int auxiliar; // VARIÁVEL AUXILIADORA - RECEBERÁ O RESULTADO E RETORNARÁ.
        if(a > b && a > c){
            auxiliar = a;
        }
        else if(b > c){
            auxiliar = b;
        }
        else{
            auxiliar = c;
        }
        return auxiliar;
    }

    // FUNÇÃO 03 - MENOR NÚMERO
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

    // FUNÇÃO 04 - DIFERENÇA
    public static int diferenca(int maior, int menor){
        int novoAuxiliar = maior - menor;
        return novoAuxiliar;
    }

    // FUNCÃO 05 - DIFERENCA
    public static void showResult(int valor){
        System.out.println("Diferença dos valores: " + valor);
    }
}
