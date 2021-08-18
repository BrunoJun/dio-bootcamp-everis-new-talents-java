import java.io.IOException;
import java.util.Scanner;

public class Desafio2 {
    
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        int N = leitor.nextInt();
        int casaComprado = 0;
        int casaSobrando = 0;
        int trabComprado = 0;
        int trabSobrando = 0;

        for (int i = 0; i < N; i++) {
        	String[] tempos = new String[2];
                tempos[0] = leitor.next();
                tempos[1] = leitor.next();

        	if (tempos[0].equals("chuva") && casaSobrando == 0) {
        		
                casaComprado++;
                trabSobrando++;
        	} else if (tempos[0].equals("chuva") && casaSobrando > 0) {
        	  
                casaSobrando--;
                trabSobrando++;
        	}

        	if (tempos[1].equals("chuva") && trabSobrando == 0){
        		 
                trabComprado++;
                casaSobrando++;
        	} else if (tempos[1].equals("chuva") && trabSobrando > 0) {
        		
                trabSobrando--;
                casaSobrando++;
        	}
        }
        leitor.close();

        System.out.println(casaComprado + " " + trabComprado);
    }
}
