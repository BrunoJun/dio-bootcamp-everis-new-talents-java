package introducaoAoCursoEConceitosBasicos.encadeamentoNo;

public class Main {
    
    public static void main(String[] args) {
        
        No<String> n1 = new No<>("Conteudo nó 1");
        No<String> n2 = new No<>("Conteudo no 2");
        No<String> n3 = new No<>("Conteudo no 3");
        No<String> n4 = new No<>("Conteudo no 4");

        n1.setProximo(n2); // nó 1 aponta para nó 2
        n2.setProximo(n3); // nó 2 aponta para nó 3
        n3.setProximo(n4); // nó 3 aponta para nó 4

        System.out.println(n1.getProximo().getProximo().getProximo()); // Chama até o nó 4.
    }
}
