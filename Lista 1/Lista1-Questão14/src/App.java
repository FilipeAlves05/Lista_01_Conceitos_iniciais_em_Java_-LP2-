import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int A = scanner.nextInt();
            
        System.out.print("Digite o valor de B: ");
        int B = scanner.nextInt();

        A = A + B; 
        B = A - B; 
        A = A - B; 
    
        System.out.println("Valores Trocados: A = " + A + ", B = " + B);
    }
}
