import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a velocidade em m/s: ");
        double velocidadeMs = scanner.nextDouble();

        double velocidadeKmh = velocidadeMs * 3.6;

        System.out.printf("A velocidade em km/h é: %.2f km/h\n", velocidadeKmh);
    }
}
