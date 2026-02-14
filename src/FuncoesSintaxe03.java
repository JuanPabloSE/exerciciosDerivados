import java.util.Locale;
import java.util.Scanner;

public class FuncoesSintaxe03 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu salário base: ");
        double salarioBase = sc.nextDouble();

        System.out.println("Quantos anos na empresa ? ");
        int anos = sc.nextInt();

        System.out.println("O funcionário bateu a meta ? (S/N): ");
        String meta = sc.next();

        double bonus = calcularBonus(salarioBase, anos, meta);
        double salarioFinal = calcularSalarioFinal(salarioBase, bonus);
        resultado(salarioBase, bonus, salarioFinal);

        sc.close();
    }

    public static double calcularBonus(double salarioBase, int anos, String meta) {
        double bonusAuxiliar;

        if (anos >= 5) {
            bonusAuxiliar = salarioBase * 0.10;
        }
        else {
            bonusAuxiliar = salarioBase * 0.05;
        }

        if (meta.equalsIgnoreCase("S")) {
            bonusAuxiliar += 500;
        }

        return bonusAuxiliar;

    }

    public static double calcularSalarioFinal(double salarioBase, double bonus) {
        return salarioBase + bonus;
    }

    public static void resultado(double salarioBase, double bonus, double salarioFinal) {
        System.out.printf("Salário base: R$%.2f%n", salarioBase);
        System.out.printf("Bonus: R$%.2f%n", bonus);
        System.out.printf("Salário final: R$ %.2f", salarioFinal);

    }

}
