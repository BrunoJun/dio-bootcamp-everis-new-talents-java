package arvoreBinaria;

import arvoreBinaria.model.Obj;

public class Main {
    
    public static void main(String[] args) {
        
        ArvoreBinaria<Obj> a1 = new ArvoreBinaria<>();

        Obj o1 = new Obj(10);

        a1.inserir(new Obj(13));
        a1.inserir(o1);
        a1.inserir(new Obj(25));
        a1.inserir(new Obj(2));
        a1.inserir(new Obj(12));
        a1.inserir(new Obj(20));
        a1.inserir(new Obj(31));
        a1.inserir(new Obj(29));
        a1.inserir(new Obj(32));

        System.out.println("Primeiro teste");
        a1.exibirInOrdem();

        System.out.println("\nSegundo teste");
        a1.exibirPreOrdem();

        System.out.println("\nTerceiro teste");
        a1.exibirPosOrdem();
    }
}
