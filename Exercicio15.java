import java.util.Scanner;
public class Exercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1 - Carro");
        System.out.println("2 - Moto");
        System.out.print("Digite o tipo do veiculo: ");
        int tipo = sc.nextInt();

        double tarifa;
        switch (tipo) {
            case 1:
                tarifa = 8.00;
                break;
            case 2:
                tarifa = 5.00;
                break;
            default:
                System.out.println("Nao existe.");
                sc.close();
                return;
        }
        System.out.print("Quantas horas tu via ficar: ");
        int horas = sc.nextInt();
        double valor = tarifa * horas;
        sc.nextLine();
        System.out.print("Possui cupom? sim ou nao: ");
        String cupom = sc.nextLine();
        if (cupom.equalsIgnoreCase("sim")) {
            if (valor >= 50) {
                valor = valor - (valor * 0.20);
                System.out.println("Desconto de 20% aplicado.");
            } else {
                System.out.println("O cupom vale apenas acima de R$ 50,00.");
            }
        }
        if (horas > 12) {
            System.out.println("Aviso: permanencia longa.");
        }
        if (horas > 24) {
            System.out.println("Aviso: cobrança de diaria.");
        }
        if (horas <= 2) {
            System.out.println("Permanencia curta");
        } else if (horas <= 6) {
            System.out.println("Permanencia media");
        } else {
            System.out.println("Permanencia longa");
        }
        System.out.printf("Valor final: R$ %.2f%n", valor);
        sc.close();
    }
}