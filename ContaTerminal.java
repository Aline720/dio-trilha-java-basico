import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception{
        //Criação do objeto Scanner para ler a entrada do usuário
        Scanner scanner =new Scanner (System.in);

        //Declaração das variáveis
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        //Solicitação de dados ao usuário
        System.out.print("Por favor, digite o número da conta:");
        numero=scanner.nextInt(); //Lê número da conta

        scanner.nextLine();Limpar o buffer do scanner
        
        System.out.print("Por favor, digite o número da Agência: ");
        agencia = scanner.nextLine(); // Lê o número da agência

        System.out.print ("Por favor, digite o nome do Cliente: ");
        nomeCliente = scanner.nextLine(); // Lê o nome do cliente

        System.out.print ("Por favor, digite o saldo: ");
        saldo = scanner.nextDouble(); // Lê o saldo

        // Exibição da mensagem final
        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
                          "sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + 
                          " já está disponível para saque.";

        System.out.println(mensagem);

        // Fechando o scanner
        scanner.close();

}

public static void main(String[] args) throws Exception{
    public class println()

