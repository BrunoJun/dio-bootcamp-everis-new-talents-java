package introducaoAoCursoEConceitosBasicos.referenciaEAtribuicao;

public class Main {
    
    public static void main(String[] args) {
        
        int a = 1;
        int b = a;

        System.out.println(a == b);

        a = 2;

        System.out.println(a == b);
        // Com os tipos primitivos ocorre uma atribuição de memória, uma cópia do valor é passado para a outra variavel.

        MeuObj objA = new MeuObj();
        objA.setNum(1);

        MeuObj objB = objA;

        System.out.println(objA);
        System.out.println(objB);
        objA.setNum(2);

        System.out.println(objA);
        System.out.println(objB);
        // Com os objetos ocorre uma passagem por referencia, onde os dois objetos compartilham o mesmo endereço de memoria.
    }
}
