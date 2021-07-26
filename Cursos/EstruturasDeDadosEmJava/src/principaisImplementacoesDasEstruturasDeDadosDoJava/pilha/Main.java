package principaisImplementacoesDasEstruturasDeDadosDoJava.pilha;

import java.util.Stack;

import principaisImplementacoesDasEstruturasDeDadosDoJava.equalEHashCode.Carro;

public class Main {
    
    public static void main(String[] args) {
        
        Stack<Carro> carros = new Stack<>();

        Carro c1 = new Carro("Ford");
        Carro c2 = new Carro("Chevrolet");
        Carro c3 = new Carro("Toyota");

        carros.push(c1);
        carros.push(c2);
        carros.push(c3);

        System.out.println(carros);
        System.out.println(carros.pop());
        System.out.println(carros);

        // O método peek ele mostra o ultimo adicionado, mas não retira, diferente do pop.
        System.out.println(carros.peek());
        System.out.println(carros);

        System.out.println(carros.isEmpty());
    }
}
