package primeirosPassosEmJava;

import java.io.IOException;
import java.util.Scanner;

public class Desafio2 {
    
    public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		int N = leitor.nextInt();
		int T, menor = 0, posMenor = 0;
		for (int i = 1; i <= N; i++) {
			T = leitor.nextInt();
			if ((T) < menor && N >= 1 && N <= 100 && T >= 0 && T <= 20) {
				
        posMenor = i;
				menor = T;
			} else if (posMenor == 0 && N >= 1 && N <= 100 && T >= 0 && T <= 20) {
				
        posMenor = i;
				menor = T;
			}
		}
		System.out.println(posMenor);
        leitor.close();
    }

}
