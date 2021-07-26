package principaisImplementacoesDasEstruturasDeDadosDoJava.lista;

import java.util.ArrayList;
import java.util.List;

import principaisImplementacoesDasEstruturasDeDadosDoJava.equalEHashCode.Carro;

public class Main {
    
    public static void main(String[] args) {
        
        List<Carro> carros = new ArrayList<>();

        Carro c1 = new Carro("Ford");
        Carro c2 = new Carro("Chevrolet");
        Carro c3 = new Carro("Toyota");
        Carro c4 = new Carro("Fiat");

        carros.add(c1);
        carros.add(c2);
        carros.add(c3);

        //usa o equals
        System.out.println(carros.contains(c4));

        System.out.println(carros.get(2));

        // usa o equal também, caso não encontre retorna -1
        System.out.println(carros.indexOf(c2));

        // o remove tem como tirar com o indice e o proprio objeto
        System.out.println(carros.remove(1));
        System.out.println(carros);


    }
}
