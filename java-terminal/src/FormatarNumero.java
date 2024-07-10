import java.text.DecimalFormat;

public class FormatarNumero {
    
    public static void main(String[] args) {
    
    //Usando DecimalFormat

    String valorFormatado = new DecimalFormat("#,##0.00").format(12005.11);
    System.out.println( valorFormatado );

    }
}
