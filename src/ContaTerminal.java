import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Digite o numero da conta: ");
            int numeroConta = scanner.nextInt();

            System.out.println("Digite a agência: ");
            String agencia = scanner.next();

            System.out.println("Digite o sobrenome do cliente: ");
            String sobrenomeCliente = scanner.next();

            System.out.println("Digite o nome do cliente: ");
            String nomeCliente = scanner.next();

            System.out.println("Digite o saldo: ");
            double saldo = scanner.nextDouble();

            System.out.println("Olá, "+nomeCliente+" "+sobrenomeCliente+"! Obrigado por criar uma conta em nosso banco. Sua agência é "+agencia+", conta "+numeroConta+" e seu saldo de R$ "+saldo+" já está disponível para saque!");
        }
    }
}
