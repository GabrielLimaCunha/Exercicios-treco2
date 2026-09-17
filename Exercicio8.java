import java.util.Scanner;
public class Exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Velocidade maxima da via: ");
        double limite = sc.nextDouble();
        System.out.print("Velocidade do veiculo: ");
        double velocidade = sc.nextDouble();
        double porcentagem = ((velocidade - limite) / limite) * 100;

        if (velocidade <= limite) {
            System.out.println("Nao ha multa");
        } else if (porcentagem <= 20) {
            System.out.println("Infracao media");
        } else if (porcentagem <= 50) {
            System.out.println("Infracao grave");
        } else {
            System.out.println("Infracao gravissima");
        }
        sc.close();
    }
}