package principaisImplementacoesDasEstruturasDeDadosDoJava.equalEHashCode;

import java.util.ArrayList;
import java.util.List;

public class CarroTeste {
    
    public static void main(String[] args) {
        
        List<Carro> listaCarros = new ArrayList<>();

        listaCarros.add(new Carro("Ford"));
        listaCarros.add(new Carro("Toyota"));
        listaCarros.add(new Carro("Hyundai"));

        System.out.println(listaCarros.contains(new Carro("Ford")));
        System.out.println(new Carro("Ford").hashCode());
        System.out.println(new Carro("Ford").hashCode());

        Carro carro1 = new Carro("Chevrolet");
        Carro carro2 = new Carro("Chevrolet");

        System.out.println(carro1.equals(carro2));
    }
}
