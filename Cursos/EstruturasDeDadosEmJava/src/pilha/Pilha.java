package pilha;

public class Pilha {
    
    private No refEntradaPilha;

    public Pilha(){

        this.refEntradaPilha = null;
    }

    public No pop(){

        if(!isEmpty()){

            No reAuxiliar = refEntradaPilha;
            refEntradaPilha = refEntradaPilha.getReferencia();
            return reAuxiliar;
        }

        return null;
    }

    public void push(int i){
        
        No refAuxiliar = refEntradaPilha;
        refEntradaPilha = new No(i);

        refEntradaPilha.setReferencia(refAuxiliar);
    }

    public No top(){

        return refEntradaPilha;
    }

    public boolean isEmpty(){

        return refEntradaPilha == null ? true : false;
    }

    @Override
    public String toString() {
        
        String resultado = "";
        No noAuxiliar = refEntradaPilha;

        while(true){
            if (noAuxiliar != null){

                resultado += noAuxiliar.getDado() + "\n";
                noAuxiliar = noAuxiliar.getReferencia();
            }else {
                break;
            }
        }

        return resultado;
    }
}
