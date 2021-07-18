package fila;

public class Main {
    
    public static void main(String[] args) {
        
        Fila<String> f1 = new Fila<>();

        f1.enqueue("primeiro");
        f1.enqueue("segundo");
        f1.enqueue("terceiro");
        f1.enqueue("quarto");

        System.out.println("Primeiro teste");
        System.out.println(f1);

        System.out.println("\nSegundo teste");
        System.out.println(f1.dequeue());
        System.out.println(f1);

        System.out.println("\nTerceiro teste");
        System.out.println(f1.first());

        System.out.println("\nQuarto teste");
        System.out.println(f1.isEmpty());
    }
}
