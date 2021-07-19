package listaEncadeada;

public class Main {
    
    public static void main(String[] args) {
        
        ListaEncadeada<String> l1 = new ListaEncadeada<>();

        l1.add("Java");
        l1.add("JavaScript");
        l1.add("Ruby");
        l1.add("Python");

        System.out.println("Primeiro teste");
        System.out.println(l1);

        System.out.println("\nSegundo teste");
        System.out.println(l1.get(1));
        System.out.println(l1.get(2));

        System.out.println("\nTerceiro teste");
        l1.remove(1);
        System.out.println(l1);
    }
}
