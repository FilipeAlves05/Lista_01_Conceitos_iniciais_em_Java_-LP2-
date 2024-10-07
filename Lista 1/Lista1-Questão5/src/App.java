import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero1 = scanner.nextInt();
        System.out.println("Digite outro número: ");
        int numero2 = scanner.nextInt();

        System.out.println("O Quociente da divisão é: " + (numero1 / numero2));
        System.out.println("O Resto da divisão é: " + (numero1 % numero2));
    }
}
