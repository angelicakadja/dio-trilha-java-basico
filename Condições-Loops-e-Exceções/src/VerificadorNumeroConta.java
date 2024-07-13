import java.util.Scanner;

public class VerificadorNumeroConta {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in) // Fechar o scanner para evitar vazamentos de recursos
        ) {
            String numeroConta = scanner.next();
            verificarNumeroConta(numeroConta);
            System.out.println(numeroConta);

            // Caso nenhuma exceção seja lançada, imprime a mensagem de sucesso.
            System.out.println("Numero de conta valido.");
            
        } catch (IllegalArgumentException e) { 
            // TODO: Informar que o número de conta é inválido e exibir a mensagem de erro
            System.out.println("Erro: " + e.getMessage());
        }
    }

    private static void verificarNumeroConta(String numeroConta) {
        //TODO: Lançar uma IllegalArgumentException com a seguinte mensagem:
        int contadorDeNumero = numeroConta.length();
        int numeroDigitado = 0;
        for (int i = 0; i < contadorDeNumero; i++) {
            numeroDigitado++;
        }
        //TODO: Numero de conta invalido. Digite exatamente 8 digitos.
        if (numeroDigitado != 8) {
            throw new IllegalArgumentException("Numero de conta invalido, por favor, digite exatamente 8 digitos.");
        }
    }
}