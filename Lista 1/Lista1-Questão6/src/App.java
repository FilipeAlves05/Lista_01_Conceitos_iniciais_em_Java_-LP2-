import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade em dias: ");
        int idade = scanner.nextInt();

        int anos = idade / 365;
        int meses = (idade % 365) / 30;
        int dias = (idade % 365) / 30;
        System.out.println("Você tem " + anos + " anos, " + meses + " meses e " + dias + " dias");
    }
}
