package principaisImplementacoesDasEstruturasDeDadosDoJava.fila;

import java.util.LinkedList;
import java.util.Queue;

import principaisImplementacoesDasEstruturasDeDadosDoJava.equalEHashCode.Carro;

public class Main {
    
    public static void main(String[] args) {
        
        Queue<Carro> carros = new LinkedList<>();

        Carro c1 = new Carro("Ford");
        Carro c2 = new Carro("Chevrolet");
        Carro c3 = new Carro("Toyota");
        Carro c4 = new Carro("Fiat");

        carros.add(c1);
        carros.add(c2);
        carros.add(c3);

        // Retorna a confirmação da adição
        System.out.println(carros.add(c4));
        System.out.println(carros);

        // O offer é parecido com o add, porem se o add não conseguir adicionar dará erro, enquanto o offer retornará false.
        System.out.println(carros.offer(c2));
        System.out.println(carros);

        // Retorna o primeiro elemento da fila.
        System.out.println(carros.peek());

        // O poll diferente do peek ele tambem retorna o primeiro elemento, mas é removido.
        System.out.println(carros.poll());
        System.out.println(carros);


        System.out.println(carros.isEmpty());

        System.out.println(carros.size());
    }
}
