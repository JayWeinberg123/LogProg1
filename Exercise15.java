package homework;
import java.util.Scanner;

public class Exercise15 {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int HORAS_SEMANAIS = 40;
        final double ACRESCIMO_HORA_EXTRA = 1.50;
        final int SEMANAS_NO_MES = 4;

        System.out.print("Digite o número total de horas trabalhadas no mês: ");
        double horasTrabalhadas = scanner.nextDouble();

        System.out.print("Digite o salário por hora: R$ ");
        double salarioPorHora = scanner.nextDouble();

        double horasExtras = Math.max(0, horasTrabalhadas - (HORAS_SEMANAIS * SEMANAS_NO_MES));
        double salarioHorasExtras = horasExtras * salarioPorHora * ACRESCIMO_HORA_EXTRA;

        double salarioBase = horasTrabalhadas * salarioPorHora;
        double salarioTotal = salarioBase + salarioHorasExtras;

        System.out.println("Salário base: R$ " + salarioBase);
        System.out.println("Salário das horas extras: R$ " + salarioHorasExtras);
        System.out.println("Salário total: R$ " + salarioTotal);

        scanner.close();
    }

}
