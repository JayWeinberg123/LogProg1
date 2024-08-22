package homework;
import java.util.Scanner;

public class Exercise10 {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota da 1ª avaliação: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a nota da 2ª avaliação: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media >= 6) {
            System.out.println("O aluno foi aprovado.");
        } else {
            System.out.println("O aluno não foi aprovado.");
        }

        System.out.println("A média calculada é: " + media);

        scanner.close();
    }

}
