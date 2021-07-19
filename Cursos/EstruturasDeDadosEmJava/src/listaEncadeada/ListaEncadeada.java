package listaEncadeada;

public class ListaEncadeada<T> {
    
    private No<T> refEntradaNo;

    private boolean validaIndice(int index) {

        if(index >= size()){

            throw new IndexOutOfBoundsException("Não existe conteudo no índice " + index);
        } else {

            return true;
        }
    }

    private No<T> getNo(int index){
        validaIndice(index);

        No<T> noAuxiliar = refEntradaNo;
        No<T> noRetorno = null;

        for(int i = 0; i <= index; i++){
            noRetorno = noAuxiliar;
            noAuxiliar = noAuxiliar.getProximoNo();
        }

        return noRetorno;
    }

    public T get(int index){

        return getNo(index).getConteudo();
    }

    public ListaEncadeada(){

        this.refEntradaNo = null;
    }

    public boolean isEmpty(){

        return refEntradaNo == null ? true : false;
    }

    public int size(){
        int tamanhoLista = 0;

        No<T> refAuxiliar = refEntradaNo;

        while(true){

            if(refAuxiliar != null){

                tamanhoLista ++;
                if (refAuxiliar.getProximoNo() != null){

                    refAuxiliar = refAuxiliar.getProximoNo();
                }else {

                    break;
                }
            } else {

                break;
            }
        }

        return tamanhoLista;
    }

    public void add(T novoConteudo){
        No<T> novoNo = new No<>(novoConteudo);

        if(this.isEmpty()){

            refEntradaNo = novoNo;
            return;
        }

        No<T> noAuxiliar = refEntradaNo;

        for(int i = 0; i < this.size()-1; i++){

            noAuxiliar = noAuxiliar.getProximoNo();
        }

        noAuxiliar.setProximoNo(novoNo);
    }

    public T remove(int index){
        No<T> noPivo = this.getNo(index);

        if (index == 0){

            refEntradaNo = noPivo.getProximoNo();
            return noPivo.getConteudo();
        }

        No<T> noAnterior = getNo(index - 1);
        noAnterior.setProximoNo(noPivo.getProximoNo()); // A JVM irá retirar o No que não tem referencia.
        return noPivo.getConteudo();

    }

    @Override
    public String toString() {
        String resultado = "";
        No<T> noAuxiliar = refEntradaNo;

        for (int i = 0; i < this.size(); i++) {
            
            resultado += noAuxiliar.getConteudo() + " ---> ";
            noAuxiliar = noAuxiliar.getProximoNo();
        }

        resultado += "null";

        return resultado;
    }
}
