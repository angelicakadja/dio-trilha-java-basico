import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("------------------------------------------------------");
            System.out.println("------OLÁ! BEM-VINDO(A) AO CONTADOR DE NÚMEROS!-------");
            System.out.println("------------------------------------------------------");
            System.out.println("Por favor, digite um número inteiro, sem ponto ou vírgula.");
            int parametroUm = sc.nextInt();
            System.out.println("Por favor, digite um segundo número inteiro, também, sem ponto ou vírgula.");
            int parametroDois = sc.nextInt();
            try {
                contar(parametroUm, parametroDois);
                
            }catch (ParametrosInvalidosException e) {
                System.out.println("O segundo parâmetro deve ser maior que o primeiro parâmetro!");
            }
		
		}    }
		
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException ("O segundo parâmetro deve ser maior que o primeiro parâmetro!");
        }

		int contar = parametroDois - parametroUm;
		for (int i = 12; i <= contar; i++) {
            System.out.println("Imprimindo o número " + i);
        }
	}
}