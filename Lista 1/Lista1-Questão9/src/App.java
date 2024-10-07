import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro menor que 32: ");
        int numero = scanner.nextInt();

        if (numero < 0 || numero >= 32) {
            System.out.println("O número tem que ser menor que 32!");
        } else {
            System.out.print("Representação binária de " + numero + " é: ");
            conversorParaBinario(numero);
        }

    }

    public static void conversorParaBinario(int numero) {
        int numbinario = 0;
        int multiplicador = 1;

        while (numero > 0) {
            int resto = numero % 2;

            numbinario += resto * multiplicador;

            numero /= 2;

            multiplicador *= 10;
        }

        System.out.println(numbinario);
    }
}

