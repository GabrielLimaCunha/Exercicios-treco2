import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        if (idade >= 16) {
            System.out.println("Pode votar");
        }
        if (idade >= 18) {
            System.out.println("Pode dirigir");
        }
        if (idade >= 60) {
            System.out.println("E idoso");
        }
        if (idade <16) { 
            System.out.println("Pode nada");
        }
        sc.close();
    }
}
