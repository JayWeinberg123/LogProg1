package homework;
import java.util.Scanner;

public class Exercise9 {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de maçãs compradas: ");
        int numeroMacas = scanner.nextInt();

        double precoPorMaca;
        if (numeroMacas < 12) {
            precoPorMaca = 1.30;
        } else {
            precoPorMaca = 1.00;
        }

        double custoTotal = numeroMacas * precoPorMaca;

        System.out.println("O custo total da compra é: R$ " + custoTotal);

        scanner.close();
    }

}
