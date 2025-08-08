import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o número da sua conta: ");
        int numeroConta = scanner.nextInt();

        //scanner vazio para consumir a quebra de linha que o nextInt() deixou para trás
        scanner.nextLine();
        
        System.out.println("Digite o número da sua agencia: ");
        String agencia = scanner.nextLine();

        System.out.println("Digite seu saldo: ");
        double saldo = scanner.nextDouble();

        scanner.close();
        
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
        
    }
}
