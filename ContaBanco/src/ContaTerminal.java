import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        
    //criando um objeto scanner para interação com o usuário

    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Por favor, digite o número da Agência: ");
    String agencia = scanner.next();
    
    System.out.println("Digite o número da conta: ");
    int conta = scanner.nextInt();

    System.out.println("Digite o seu nome: ");
    String nome = scanner.next();

    System.out.println("Digite o seu sobrenome: ");
    String sobrenome = scanner.next();
   
    System.out.println("Digite o número da saldo: ");
    double saldo = scanner.nextDouble();

    
    System.out.println("Olá! " + nome + " " + sobrenome + "obrigado por criar uma conta em nosso banco.");
    System.out.println("Sua agência é " + agencia + " " + "e sua conta bancária é " + conta);
    System.out.println("Seu saldo de R$ " + saldo + "já está disponível para saque.");

    }


}