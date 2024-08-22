package homework;
import java.util.Scanner;

public class Exercise6 {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Fahrenheit: ");
        double temperaturaFahrenheit = scanner.nextDouble();

        double temperaturaCelsius = (temperaturaFahrenheit - 32) * 5 / 9;

        System.out.println("A temperatura correspondente em graus Celsius é: " + temperaturaCelsius);

        scanner.close();
    }
	
	

}
