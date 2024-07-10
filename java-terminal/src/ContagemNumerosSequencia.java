public class ContagemNumerosSequencia {
    public static void main(String[] args) {
        int[] vetor = { 1, 1, 2, 1, 3, 3, 3, 3, 3, 4, 1, 1, 1, 2, 2, 2, 3, 4, 4, 4 };
        System.out.print("\n Frequencia dos numeros \n");
        int cont = 1;
        int num = 0;
        for (int i = 0; i < vetor.length; i++) {
            cont = 0;
            for (int j = 0; j < vetor.length; j++) {
                if (vetor[i] == vetor[j]) {
                    cont++;
                    num = vetor[i];
                }
                System.out.println(" repeticoes numero " + num + ": " + cont + " vezes");
            }
        }
    }
}