import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
  
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("------------------------------------------------------");
        System.out.println("-------------BEM-VINDO(A) A NOSSA AGÊNCIA-------------");
        System.out.println("------------------------------------------------------");
        System.out.println("******  Vamos criar conta bancária para você!!  ******");
        System.out.println("------------------------------------------------------");
        System.out.println("------ POR FAVOR, DIGITE EM LETRAS MAIÚSCULAS! -------");
        
        //TODO - Você está criando uma conta!
            
        System.out.println("Digite o número da conta: ");
        int conta = scanner.nextInt();
        
        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = scanner.next();

        System.out.println("Digite o seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite o seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Existe algum depósito inicial (S/N)? ");
        char resposta = scanner.next().charAt(0);
        if (resposta == 'S') {
            System.out.println("Insira o valor inicial de depósito: ");
            double depositoInicial = scanner.nextDouble();  

        System.out.println("Olá! " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + agencia + " " + "e sua conta bancária é " + conta + ".");
        System.out.println("Seu saldo inicial é de R$ " + depositoInicial + " já está disponível para saque!");
        
    }
    }
}