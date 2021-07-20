package listaDuplamenteEncadeada;

public class Main {
    
    public static void main(String[] args) {
        
        ListaDuplamenteEncadeada<String> l1 = new ListaDuplamenteEncadeada<>();

        l1.add("teste1");
        l1.add("teste2");
        l1.add("teste3");
        l1.add("teste4");
        l1.add("teste5");
        l1.add("teste6");
        l1.add("teste7");

        System.out.println("Primeiro teste");
        System.out.println(l1);

        System.out.println("\nSegundo teste");
        l1.remove(1);
        System.out.println(l1);

        System.out.println("\nTerceiro teste");
        l1.add(1, "testeDeAdição");
        System.out.println(l1);

        System.out.println("\nQuarto teste");
        System.out.println(l1.get(1));
    }
}
