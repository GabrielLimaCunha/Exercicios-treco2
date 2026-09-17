import java.util.Scanner;
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Temperatura: ");
        double temperatura = sc.nextDouble();

        System.out.print("Umidade: ");
        double umidade = sc.nextDouble();

        if (temperatura >= 38) {
            System.out.println("Alerta de calor extremo");
        }
        if (umidade < 30) {
            System.out.println("Alerta de umidade baixa");
        }
        if (temperatura >= 35 && umidade < 20) {
            System.out.println("Alerta de risco de queimada");
        }
        if (temperatura < 35 && umidade > 20) {
            System.out.println("Ta safe");
        }
        sc.close();
    }
}