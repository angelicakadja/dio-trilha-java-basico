public class CaixaEletronico {
    public static void main (String[] args) {

        double saldo = 25.0;
        double valorSolicitado = 17.0;
        
        // Se tem saldo na conta
        if (saldo >= valorSolicitado){
         saldo -= valorSolicitado;
         System.out.println("Saque realizado com sucesso. Saque de R$ " + valorSolicitado + ". " + "Seu saldo atual é de R$ " + saldo + ".");
        }
        // Não tem saldo na conta
        else 
        System.out.println("Saldo solicitado maior que seu saldo atual. Seu saldo é de R$ " + saldo);
 
     }
 }
