package homework;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de carros vendidos: ");
        int numeroCarrosVendidos = scanner.nextInt();

        System.out.print("Digite o valor total das vendas: ");
        double valorTotalVendas = scanner.nextDouble();

        System.out.print("Digite o salário fixo do vendedor: ");
        double salarioFixo = scanner.nextDouble();

        System.out.print("Digite o valor da comissão por carro vendido: ");
        double comissaoPorCarro = scanner.nextDouble();

        double comissaoTotal = numeroCarrosVendidos * comissaoPorCarro;
        double percentualVendas = valorTotalVendas * 0.05;
        double salarioFinal = salarioFixo + comissaoTotal + percentualVendas;

        System.out.println("O salário final do vendedor é: " + salarioFinal);

        scanner.close();
        
    }
}
