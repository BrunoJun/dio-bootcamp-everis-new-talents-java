package principaisImplementacoesDasEstruturasDeDadosDoJava.equalEHashCode;

import java.util.Objects;

public class Carro implements Comparable<Carro>{
    
    public String marca;

    public Carro(String marca) {

        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (obj == null || this.getClass() != obj.getClass()) return false;

        Carro carro = (Carro) obj;

        return Objects.equals(marca, carro.marca);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca);
    }

    @Override
    public String toString() {
        
        return marca;
    }

    @Override
    public int compareTo(Carro outro) {

        // Ordenado pelo tamanho da String.

        // if (this.marca.length() > outro.marca.length()){

        //     return 1;
        // } else if (this.marca.length() < outro.marca.length()) {

        //     return -1;
        // }

        // Ordem alfabética
        return this.getMarca().compareTo(outro.marca);
    }
}
