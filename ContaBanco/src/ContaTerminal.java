import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da sua conta!");
        int numeroConta = scanner.nextInt();
        System.out.println("Por favor, digite o número da sua agência!");
        String agencia = scanner.next();
        System.out.println("Por favor, digite o seu nome!");
        scanner.next(); // Coloquei pra limpar o buffer
        String nomeCliente = scanner.nextLine();
        System.out.println("Por favor, digite o seu saldo!");
        double saldo = scanner.nextDouble();

        System.out.println(
                "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                        + agencia + ", conta " + numeroConta + " e seu saldo " + saldo
                        + " já está disponível para saque");

        scanner.close();

    }
}
