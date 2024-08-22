package homework;
import java.util.Scanner;

public class Exercise14 {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a hora de início do jogo (0 a 23): ");
        int horaInicio = scanner.nextInt();

        System.out.print("Digite a hora de fim do jogo (0 a 23): ");
        int horaFim = scanner.nextInt();

        int duracao;
        if (horaFim >= horaInicio) {
            duracao = horaFim - horaInicio;
        } else {
            duracao = (24 - horaInicio) + horaFim;
        }

        System.out.println("A duração do jogo é: " + duracao + " horas.");

        scanner.close();
    }

}
