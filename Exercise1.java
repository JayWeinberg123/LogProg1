package homework;
import java.util.Scanner;

public class Exercise1 {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade em anos: ");
        int anos = scanner.nextInt();

        System.out.print("Meses: ");
        int meses = scanner.nextInt();

        System.out.print("Dias: ");
        int dias = scanner.nextInt();

        int totalDias = (anos * 365) + (meses * 30) + dias;

        System.out.println("Sua idade total em dias é: " + totalDias);

        scanner.close();
    }

}
