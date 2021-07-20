package listaCircular;

public class Main {
    
    public static void main(String[] args) {
        
        ListaCircular<String> l1 = new ListaCircular<>();

        l1.add("teste1");
        l1.add("teste2");
        l1.add("teste3");
        l1.add("teste4");

        System.out.println("Primeiro teste");
        System.out.println(l1);

        System.out.println("\nSegundo teste");
        l1.remove(1);
        System.out.println(l1);

        System.out.println("\nTerceiro teste");
        System.out.println(l1.get(2));

        System.out.println("\nQuarto teste");
        System.out.println(l1.get(4)); //loop

        
    }
}
