public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a hora: ");
        int hora = sc.nextInt();

        if (hora >= 0 && hora <= 11) {
            System.out.println("Bom dia");
        } else if (hora <= 17 && hora >= 12) {
            System.out.println("Boa tarde");
        } else if (hora <= 23 && hora >= 18) {
            System.out.println("Boa noite");
        } else {
            System.out.println("Hora nao existe");
        }
        sc.close();
    }
}