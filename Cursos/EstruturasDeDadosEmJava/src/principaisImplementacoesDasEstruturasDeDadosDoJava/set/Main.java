package principaisImplementacoesDasEstruturasDeDadosDoJava.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import principaisImplementacoesDasEstruturasDeDadosDoJava.equalEHashCode.Carro;

public class Main {
    
    public static void main(String[] args) {
        
        Set<Carro> carros = new HashSet<>();

        Carro c1 = new Carro("Ford");
        Carro c2 = new Carro("Chevrolet");
        Carro c3 = new Carro("Toyota");
        Carro c4 = new Carro("Fiat");
        Carro c5 = new Carro("Peugeout");

        carros.add(c1);
        carros.add(c2);
        carros.add(c3);
        carros.add(c4);
        carros.add(c5);

        System.out.println(carros);

        Set<Carro> treeCarros = new TreeSet<>();

        treeCarros.add(c1);
        treeCarros.add(c2);
        treeCarros.add(c3);
        treeCarros.add(c4);
        treeCarros.add(c5);

        System.out.println(treeCarros);
    }
}

