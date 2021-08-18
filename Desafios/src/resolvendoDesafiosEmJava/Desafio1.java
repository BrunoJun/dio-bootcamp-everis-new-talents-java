import java.io.IOException;
import java.util.Scanner;
import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Desafio1 {
    
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        Double X = leitor.nextDouble();
        BigDecimal[] N = new BigDecimal[100];
        N[0] = new BigDecimal(X);
        for (int i = 1; i <= 99; i++) {
        	
            N[i] = N[i - 1].divide(new BigDecimal(2));
        }

        leitor.close();
        
        DecimalFormat decFormat = new DecimalFormat("0.0000");

        for (int i = 0; i < 100; ++i) {

            System.out.println("N[" + i + "] = " + decFormat.format(N[i]));
        }
    }
}
