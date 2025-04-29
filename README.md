import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);

        // Solicita o saldo inicial
        System.out.print("Digite o saldo inicial da conta: ");
        double saldoInicial = scanner.nextDouble();

        // Inicializa o saldo final com o saldo inicial
        double saldoFinal = saldoInicial;

        // Solicita as três transações
        for (int i = 1; i <= 3; i++) {
            System.out.print("Digite o valor da transação " + i + " (positivo para depósito, negativo para saque): ");
            double transacao = scanner.nextDouble();
            saldoFinal += transacao; // Atualiza o saldo final
        }

        // Exibe o saldo final
        System.out.printf("O saldo final da conta é: %.2f%n", saldoFinal);

        // Fecha o scanner
        scanner.close();
    }
}
