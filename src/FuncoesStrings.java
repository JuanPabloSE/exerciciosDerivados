import java.util.Scanner;

public class FuncoesStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String original = "abcde FGHIJ ABC abc DEFEG   ";

        // Funções de Strings em JAVA

        System.out.println("Original: -" + original + "-");
        String s01 = original.toLowerCase(); // TRANSFORMA TUDO EM LETRAS MINÚSCULAS
        String s02 = original.toUpperCase(); // TRANSFORMA TUDO EM LETRAS MAIÚSCULAS
        String s03 = original.trim(); // ELIMINA OS ESPAÇOS NOS CANTOS DA STRING

        System.out.println("toLowerCase: -" + s01 + "-");
        System.out.println("toUpperCase: -" +s02 + "-");
        System.out.println("trim: -" + s03 + "-");




        sc.close();
    }
}
