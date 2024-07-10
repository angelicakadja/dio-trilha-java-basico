import java.util.ArrayList;
import java.util.Scanner;

public class SomarNaSequencia {
    public static void main (String[] args) {

        // COLOQUE MENSAGENS PRA VOCE ENTENDER E VISUALIZAR O QUE SEU CODIGO FAZ
        
            Scanner ler = new Scanner(System.in);
        
            System.out.printf("Informe um Número Inteiro para \"X\": ");
            // aqui leio o x fora do loop , pois é um valor fixo
        
            // crio as variaveis
            int x = ler.nextInt();
            int z;
        
            // crio uma lista onde vou armazenar os valores de "Z"
            ArrayList<Integer> lista_de_z = new ArrayList<Integer>();
        
            // adiciono X de cara pois na soma total ele deve ser incluido
            lista_de_z.add(x);
        
            // aqui usei o "Do While" pois o do testa os valores depois do primeiro
            // loop.
        
            do {
                // mensagem para saber o que esta acontecendo
                System.out.printf("Informe um Número Inteiro para \"Z\": \n");
        
                // "Z" recebe o valor lido
                z = ler.nextInt();
        
                // comparo se "Z" é maior que "X"
        
                if (z > x) {
                    // se z for maior coloco ele na minha lista para somar
                    lista_de_z.add(z);
                }
                System.out.println("x vale:" + x);
                System.out.println("z vale:" + z);
                System.out.println("tenho " + lista_de_z + " valores para x e z na lista");
                System.out.println("Resultado esperado: " + lista_de_z.size());
        
            } while (x >= z);
            System.out.println("Saiu do while pois z é maior que x");
        }
    }