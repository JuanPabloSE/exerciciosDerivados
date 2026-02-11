import java.util.Scanner;

public class FuncoesStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String original = "abcde FGHIJ ABC abc DEFEG   ";

        /* Funções de Strings em JAVA */

        System.out.println("Original: -" + original + "-");
        String s01 = original.toLowerCase(); // TRANSFORMA TUDO EM LETRAS MINÚSCULAS.
        String s02 = original.toUpperCase(); // TRANSFORMA TUDO EM LETRAS MAIÚSCULAS.
        String s03 = original.trim(); // ELIMINA OS ESPAÇOS NOS CANTOS DA STRING.
        String s04 = original.substring(2); // PEGA SOMENTE AS LETRAS DA POSIÇÃO INFORMADA EM DIANTE.
        String s05 = original.substring(2, 9); // PEGA SOMENTE AS LETRAS DAS POSIÇÕES INFORMADAS EM DIANTE E VOLTA.
        String s06 = original.replace('a', 'x'); // SUBSTITUI UM CARACTER/LETRA POR OUTRA.
        String s07 = original.replace("abc", "xy"); // SUBSTITUI SUBSTRINGS INFORMADOS.
        int i = original.indexOf("bc"); // PEGA O VALOR DO PRIMEIRO "bc" informado.
        int j = original.lastIndexOf("bc"); // PEGA O VALOR DO ÚLTIMO "bc"informado.

        System.out.println("toLowerCase: -" + s01 + "-");
        System.out.println("toUpperCase: -" +s02 + "-");
        System.out.println("trim: -" + s03 + "-");
        System.out.println("substring(2): -" + s04 + "-");
        System.out.println("substring(2, 9): -" + s05 + "-");
        System.out.println("REPLACE('a', 'x'): -" + s06 + "-");
        System.out.println("REPLACE('abc', 'xy'): -" + s07 + "-");
        System.out.println("Index OF 'bc': " + i);
        System.out.println("Last Index OF 'bc': " + j);

        // FUNÇÃO SPLIT - RECEBE UM SEPARADOR E GERA UM VETOR COM AS PARTES DA STRING.
        String s = "potato apple lemon";

        String [] vect = s.split(" ");

        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2]);


        sc.close();
    }
}
