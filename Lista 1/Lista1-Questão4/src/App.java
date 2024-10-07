public class App {
    public static void main(String[] args) throws Exception {
        double lado = 5.2;
        System.out.println("A Área do Triângulo é: " +  String.format("%.2f" , (Math.pow(lado , 2)/2)) + "cm");
        System.out.println("O Perímetro do Triângulo é: " + String.format("%.2f" , (lado * 3)) + "cm");
    }
}
