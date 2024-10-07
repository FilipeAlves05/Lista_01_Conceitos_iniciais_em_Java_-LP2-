import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tempo gasto na viagem ");
        double tempo = scanner.nextDouble();

        System.out.print("Digite a velocidade média durante a viagem: ");
        double velocidade = scanner.nextDouble();

        double distancia = tempo * velocidade;

        double consumo = distancia / 12;

        System.out.printf("A distância percorrida foi: %.2f km\n", distancia);
        System.out.printf("A quantidade de combustível gasto foi: %.2f litros\n", consumo);

    }
}
