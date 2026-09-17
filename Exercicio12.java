import java.util.Scanner;
public class Exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Saldo: R$ ");
        double saldo = sc.nextDouble();
        System.out.print("Limite diario: R$ ");
        double limite = sc.nextDouble();
        System.out.print("Valor do saque: R$ ");
        double saque = sc.nextDouble();

        if (saldo < saque) {
            System.out.println("Saldo insuficiente");
        } else {
            if (saque > limite) {
                System.out.println("Valor ultrapassa o limite diario");
            } else {
                saldo = saldo - saque;
                System.out.printf("Novo saldo: R$ %.2f%n", saldo);
            }
        }
        sc.close();
    }
}