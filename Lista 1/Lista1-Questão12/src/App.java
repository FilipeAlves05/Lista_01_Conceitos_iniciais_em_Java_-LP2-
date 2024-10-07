import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da resistência R1 (em ohms): ");
        double R1 = scanner.nextDouble();
        
        System.out.println("Digite o valor da resistência R2 (em ohms): ");
        double R2 = scanner.nextDouble();
        
        System.out.println("Digite o valor da resistência R3 (em ohms): ");
        double R3 = scanner.nextDouble();


        double resistenciaparalela = (R1 * R2) / (R1 + R2);
        double resistenciaequivalente = resistenciaparalela + R3;

        System.out.println("A resistência equivalente do circuito é:" + resistenciaequivalente + "ohms\n");
    }
}
