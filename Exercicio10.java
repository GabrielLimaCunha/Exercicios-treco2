import java.util.Scanner;
public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Usuario: ");
        String usuario = sc.nextLine();
        System.out.print("Senha: ");
        String senha = sc.nextLine();

        if (usuario.equals("admin")) {
            if (senha.equals("java123")) {
                System.out.println("Senha correta");
            } else {
                System.out.println("Senha incorreta");
            }
        } else {
            System.out.println("Nao tem usuario");
        }
        sc.close();
    }
}