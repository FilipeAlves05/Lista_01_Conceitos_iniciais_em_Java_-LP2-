import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        double semestre1 = calcularMediaSemestral(1, 2);     
        System.out.println("A média semestral é: " + semestre1);
    }

    public static double calcularMediaSemestral(int num1 , int num2) {
        Scanner scanner = new Scanner(System.in);
        double media = 0;

        System.out.print("Digite as notas do " + num1 + " bimestre: ");
        System.out.print("Prova 1: ");
        media += scanner.nextDouble();
        System.out.print("Prova 2: ");
        media += scanner.nextDouble();

        System.out.print("Digite as notas do " + num2 + " bimestre: ");
        System.out.print("Prova 3: ");
        media += scanner.nextDouble();
        System.out.print("Prova 4: ");
        media += scanner.nextDouble();

        return (media / 2);
    }
}


