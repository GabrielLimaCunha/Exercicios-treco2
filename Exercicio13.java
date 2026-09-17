import java.util.Scanner;
public class Exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        double n1 = sc.nextDouble();
        System.out.print("Digite o segundo numero: ");
        double n2 = sc.nextDouble();
        System.out.println("1 - Soma");
        System.out.println("2 - Subtracao");
        System.out.println("3 - Multiplicacao");
        System.out.println("4 - Divisao");
        System.out.print("Escolha uma opcao: ");
        int opcao = sc.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("Resultado: " + (n1 + n2));
                break;
            case 2:
                System.out.println("Resultado: " + (n1 - n2));
                break;
            case 3:
                System.out.println("Resultado: " + (n1 * n2));
                break;
            case 4:
                if (n2 == 0) {
                    System.out.println("Nao e possivel dividir por zero.");
                } else {
                    System.out.println("Resultado: " + (n1 / n2));
                }
                break;
            default:
                System.out.println("Nao existe");
        }
        sc.close();
    }
}