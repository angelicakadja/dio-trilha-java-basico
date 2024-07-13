import java.util.Scanner;

public class OperacoesBancarias {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        operacoes();
        }

    private static void operacoes() {

        System.out.println("------------------------------------------------------");
        System.out.println("----------Olá! Bem-vind(a) a nossa Agência!-----------");
        System.out.println("------------------------------------------------------");
        System.out.println("******* Por gentileza, digite a opção desejada *******");
        System.out.println("------------------------------------------------------");
        System.out.println("|   Opção 1 - Depositar               |");
        System.out.println("|   Opção 2 - Sacar                   |");
        System.out.println("|   Opção 3 - Consultar saldo         |");
        System.out.println("|   Opção 4 - Encerrar                |");
    
            int opcao = input.nextInt();
            
            switch (opcao) { 
            
            case 1: // TODO: Ler o valor a ser depositado e atualizar/imprimir o saldo.
                depositar();
                break;

            case 2: // TODO: Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente.
                sacar();
                break;

            case 3: // TODO: Exibir o saldo atual da conta.
                consultarSaldo();
                break;

            case 4:
                System.out.println("Programa encerrado.");
                System.exit(0); // Atualiza a variável de controle para encerrar o loop

            default:
                System.out.println("Opção inválida. Tente novamente!");
                break;
        }            
    }

    private static void consultarSaldo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'consultarSaldo'");
    }

    private static void depositar() {
        System.out.println("Número da conta: ");
        int numeroConta = input.nextInt();
        Conta conta = encontrarConta(numeroConta);

        if(conta != null) {
            System.out.println("Qual valor deseja depositar? ");
            Double valorDeposito = input.nextDouble();

            conta.depositar(valorDeposito);
        }else {
            System.out.println("--- Conta não encontrada ---");
        }

        operacoes();

    }


    private static OperacoesBancarias.Conta encontrarConta(int numeroConta) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'encontrarConta'");
    }

    private static void sacar() {
        System.out.println("Número da conta: ");
        int numeroConta = input.nextInt();

        Conta conta = encontrarConta(numeroConta);

        if(conta != null) {
            System.out.println("Qual valor deseja sacar? ");
            Double valorSaque = input.nextDouble();

            conta.sacar(valorSaque);
            System.out.println("--- Saque realizado com sucesso! ---");
        }else {
            System.out.println("--- Conta não encontrada ---");
        }

        operacoes();

    }

    private static class Conta {

        public Conta() {
        }

        public void sacar(Double valorSaque) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'sacar'");
        }

        public void depositar(Double valorDeposito) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'depositar'");
        }
    }



}