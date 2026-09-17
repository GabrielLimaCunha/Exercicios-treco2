import java.util.Scanner;
public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor da compra: R$ ");
        double compra = sc.nextDouble();
        double frete;
        double total;

        if (compra >= 199) {
            frete = 0;
        } else {
            frete = 24.90;
        }
        total = compra + frete;
        System.out.printf("Frete: R$ %.2f%n", frete);
        System.out.printf("Total: R$ %.2f%n", total);
        sc.close();
    }
}