import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a temperatura em Fahrenheit: ");
        double tempFahrenheit = scanner.nextDouble();

        double tempCelsius = (tempFahrenheit - 32) * (5.0/9.0);

        System.out.println("A temperatura em Celsius é: " + tempCelsius + "º");
    }
}
