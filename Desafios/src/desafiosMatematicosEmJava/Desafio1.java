
package desafiosMatematicosEmJava;

import java.io.IOException;
import java.util.Scanner;

public class Desafio1 {
    
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double soma = 0;
        char O = leitor.next().toUpperCase().charAt(0);
        double[][] M = new double[12][12];
        for (int i = 0; i <= 11; i++) {
        	for (int j = 0; j <= 11; j++) {
        		M[i][j] = leitor.nextDouble();
        	}
        }

        leitor.close();
        
        for (int i = 1; i <= 10; i++) {
        	for (int j = 7; j <= 11; j++) {
        		if ((i + j) >= 12 && i != j && (i + j) != 11 && j > i) soma += M[i][j];
        	}
        }

        if (O == 'M') soma /= 30;
    	System.out.println(String.format("%.1f", soma));
    }
}
