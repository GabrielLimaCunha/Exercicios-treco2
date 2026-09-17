import java.util.Scanner;
public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Frequencia de 0 a 100: ");
        double frequencia = sc.nextDouble();
        System.out.print("Media final de 0 a 10: ");
        double media = sc.nextDouble();

        if (frequencia < 75) {
            System.out.println("Reprovado por falta");
        } else {
            if (media >= 7) {
                System.out.println("Aprovado");
            } else if (media >= 5) {
                System.out.println("Recuperacao");
            } else {
                System.out.println("Reprovado por nota");
            }
        }
        sc.close();
    }
}