import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Agência!");
        String agencia = scanner.nextLine();
        System.out.println("Por favor, digite o número da Conta!");
        int conta = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Por favor, digite o nome do Cliente!");
        String nome = scanner.nextLine();
        System.out.println("Por favor, digite o Saldo!");
        double saldo = scanner.nextDouble();
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta +"  e seu saldo R$ " + saldo +" já está disponível para saque.");
    }
}
