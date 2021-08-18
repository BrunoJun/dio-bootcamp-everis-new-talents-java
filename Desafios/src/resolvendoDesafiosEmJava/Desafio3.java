import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Desafio3 {

    public static void main(String[] args) throws IOException {
        int N;

        Scanner entrada = new Scanner(System.in);
        
        N = entrada.nextInt();
        entrada.nextLine();
        
        List<Tshirt> tshirts = new ArrayList<>();
        
        while (N != 0){

            for (int i = 0; i < N; i++) {
                String nomeAluno;
                String detalhesinicio;
                String[] detalhes;
            
                nomeAluno = entrada.nextLine();

                detalhesinicio = entrada.nextLine();
                detalhes = detalhesinicio.split(" ");
    
                tshirts.add(new Tshirt(detalhes[1], detalhes[0], nomeAluno));
            }

            N = entrada.nextInt();
            entrada.nextLine();
        }
        
        entrada.close();
        Collections.sort(tshirts);
        
        tshirts.forEach(System.out::println);
    }
}

class Tshirt implements Comparable<Tshirt>{

    private String size;
    private String color;
    private String owner;

    public Tshirt(String size, String color, String owner) {
        this.size = size;
        this.color = color;
        this.owner = owner;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return this.getColor() + " " + this.getSize() + " " + this.getOwner();
    }

    @Override
    public int compareTo(Tshirt o) {

        int cor = this.getColor().compareTo(o.getColor());
        int tamanho = this.getSize().compareTo(o.getSize());
        int nome = this.getOwner().compareTo(o.getOwner());

        if (cor != 0){

            return this.getColor().compareTo(o.getColor());
        } else if(tamanho != 0) {

            return o.getSize().compareTo(this.getSize());
        } else if (nome != 0){

            return this.getOwner().compareTo(o.getOwner());
        }
        

        return 0;
    }
}
