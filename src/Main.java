import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcaoCliente = 0;
        double valorTransferencia = 0;
        double valorDeposito = 0;
        String nomeCliente = "Nathan Pereira Pinto";
        String tipoConta = "Corrente";
        double saldoCliente = 2500.00;

        System.out.println("====== DADOS DO CLIENTE ======");
        System.out.println("Nome: " + nomeCliente);
        System.out.println("Tipo da Conta: " + tipoConta);
        System.out.println("Saldo inicial: " + saldoCliente);
        System.out.println("******************************");

        while (opcaoCliente != 4){
            System.out.println("====== OPERAÇÕES ======");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Receber valor");
            System.out.println("3. Transferir valor");
            System.out.println("4. Sair");

            opcaoCliente = scanner.nextInt();

            if (opcaoCliente == 1){
                System.out.println("O seu saldo atual é " + saldoCliente);

            } else if (opcaoCliente == 2) {
                System.out.println("Quanto você quer depositar?");
                valorDeposito = scanner.nextDouble();

                if (valorDeposito <= 0){
                    System.out.println("Não foi possível concluir. Digite um valor válido");
                } else {
                    saldoCliente = saldoCliente + valorDeposito;
                    System.out.println("O seu saldo atual é " + saldoCliente);
                }

            } else if (opcaoCliente == 3) {
                System.out.println("Quanto você quer transferir?");
                valorTransferencia = scanner.nextDouble();

                if (valorTransferencia > saldoCliente) {
                    System.out.println("Não foi possível concluir. Saldo insuficiente");
                } else if (valorTransferencia <= 0) {
                    System.out.println("Não foi possível concluir. Digite um valor válido");
                } else {
                    saldoCliente = saldoCliente - valorTransferencia;
                    System.out.println("Transferência Concluída!");
                    System.out.println("O seu saldo atual é " + saldoCliente);
                }

            } else if (opcaoCliente == 4) {
                break;

            } else {
                System.out.println("Opção inválida.");
            }
        }
        System.out.println("Operação encerrada");
    }
}