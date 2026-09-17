import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = sc.nextInt();

        int absoluto = Math.abs(numero);

        if (numero > 0) {
            System.out.println("E positivo");
        }
        if (numero % 2 == 0) {
            System.out.println("E par");
        }
        if (numero % 5 == 0) {
            System.out.println("E multiplo de 5");
        }
        if (absoluto >= 10 && absoluto <= 99) {
            System.out.println("Tem dois digitos");
        }
        sc.close();
    }
}