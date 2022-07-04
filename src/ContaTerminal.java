import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numeroConta;
        int agencia;
        String nomeCliente;
        double saldo;

        System.out.print("Por favor, digite o seu nome: ");
        nomeCliente = input.nextLine();
        System.out.print("Olá " + nomeCliente + ", digite o numero da agencia: ");
        agencia = input.nextInt();
        System.out.print("Digite o numero da conta: ");
        numeroConta = input.nextInt();
        System.out.print("Digite o valor que gostaria de digitar: ");
        saldo = input.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
                ", conta " + numeroConta + "  e seu saldo " + saldo + " já está disponível para saque.");
   }
}
