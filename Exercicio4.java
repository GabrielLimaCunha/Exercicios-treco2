import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Primeiro numero: ");
        int n1 = sc.nextInt();

        System.out.print("Segundo numero: ");
        int n2 = sc.nextInt();

        if (n2 == 0) {
            System.out.println("A verificacao nao pode ser feita");
        } else {
            if (n1 % n2 == 0) {
                System.out.println("O primeiro e mutiplo do segundo");
            } else {
                System.out.println("O primeiro nao e multiplo do segundo");
            }
        }
        sc.close();
    }
}