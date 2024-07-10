import java.util.ArrayList;
import java.util.List;

public class ImprimirListaNumerosSequencia {
    
    public static void main(String[] args) {

    List<Long> lista = new ArrayList();

        long k = 0;

        /*Como Imprimir uma lista de números somados em sequência?
        *aqui você pode trocar por outros números que quer
        *fazer a sequencia tendo ele como base
        */
        
        int base = 2; 

        for (long a = 1; a <= 10; a++) {

        k += (base*a); 

        lista.add(k);
    }  

        System.out.println("Soma="+lista);
 }
}