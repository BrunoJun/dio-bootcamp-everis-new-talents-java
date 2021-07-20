package listaCircular;

public class ListaCircular<T> {
    
    private No<T> cabeca;
    private No<T> cauda;
    private int tamanhoLista;

    private No<T> getNo(int index){

        if(isEmpty()) throw new IndexOutOfBoundsException();

        if(index == 0){

            return this.cauda;
        }

        No<T> noAuxiliar = cauda;

        for (int i = 0; i < index && noAuxiliar != null; i++) {
            
            noAuxiliar = noAuxiliar.getNoProximo();
        }

        return noAuxiliar;
    }

    public ListaCircular(){

        this.cauda = null;
        this.cabeca = null;
        this.tamanhoLista = 0;
    }

    public T get(int index){

        return getNo(index).getConteudo();
    }

    public boolean isEmpty(){

        return this.tamanhoLista == 0 ? true : false;
    }

    public int size(){

        return this.tamanhoLista;
    }

    public void remove(int index){

        if(index >= tamanhoLista) throw new IndexOutOfBoundsException("O indice é maior que o tamanho da lista");

        No<T> noAuxiliar = cauda;

        if (index == 0){

            this.cauda = this.cauda.getNoProximo();
            this.cabeca.setNoProximo(this.cauda);
        } else if (index == 1){

            this.cauda.setNoProximo(this.cauda.getNoProximo().getNoProximo());
        } else {

            for (int i = 0; i < index-1; i++) {
                
                noAuxiliar = noAuxiliar.getNoProximo();
            }

            noAuxiliar.setNoProximo(noAuxiliar.getNoProximo().getNoProximo());
        }

        this.tamanhoLista--;
    }

    public void add(T conteudo){
        No<T> novoNo = new No<>(conteudo);

        if(isEmpty()){

            this.cabeca = novoNo;
            this.cauda = this.cabeca;
            this.cabeca.setNoProximo(cauda);
        } else {

            novoNo.setNoProximo(this.cauda);
            this.cabeca.setNoProximo(novoNo);
            this.cauda = novoNo;
        }

        this.tamanhoLista++;
    }

    @Override
    public String toString() {
        String resultado = "";
        No<T> noAuxiliar = cauda;

        for (int i = 0; i < this.size(); i++) {
            
            resultado += noAuxiliar.getConteudo() + " ---> ";
            noAuxiliar = noAuxiliar.getNoProximo();
        }

        resultado += isEmpty() ? "Vazia" :"(Retorna ao início)";

        return resultado;
    }
}
