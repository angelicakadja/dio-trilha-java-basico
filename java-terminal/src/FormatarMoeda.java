import java.text.NumberFormat;

public class FormatarMoeda {
    public static void main(String[] args) {
    
    //Usando NumberFormat
    String valorFormatado = NumberFormat.getCurrencyInstance().format(12005.11);
    System.out.println( valorFormatado );

    }

}
