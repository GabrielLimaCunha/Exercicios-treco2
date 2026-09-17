import java.util.Scanner;
public class Exercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Salario: R$ ");
        double salario = sc.nextDouble();

        System.out.print("Anos na empresa: ");
        int anos = sc.nextInt();
        double percentual;

        if (anos < 1) {
            percentual = 0;
        } else if (anos <= 3) {
            percentual = 5;
        } else if (anos <= 10) {
            percentual = 10;
        } else {
            percentual = 15;
        }
        double bonus = salario * percentual / 100;
        System.out.printf("Percentual: %.0f%%%n", percentual);
        System.out.printf("Bonus: R$ %.2f%n", bonus);
        sc.close();
    }
}