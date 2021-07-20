package listaDuplamenteEncadeada;

public class ListaDuplamenteEncadeada<T> {
    
    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;
    
    private int tamanhoLista;

    public ListaDuplamenteEncadeada(){

        this.primeiroNo = null;
        this.ultimoNo = null;
        this.tamanhoLista = 0;
    }

    private NoDuplo<T> getNo(int index){
        NoDuplo<T> noAuxiliar = primeiroNo;

        for (int i = 0; i < index && noAuxiliar != null; i++) {
            
            noAuxiliar = noAuxiliar.getNoProximo();
        }

        return noAuxiliar;
    }

    public T get(int index){

        return this.getNo(index).getConteudo();
    }

    public int size(){
    
        return tamanhoLista;
    }

    public void add(T conteudo){
        NoDuplo<T> novoNo = new NoDuplo<>(conteudo);
        novoNo.setNoProximo(null);
        novoNo.setNoAnterior(ultimoNo);

        if(primeiroNo == null){

            primeiroNo = novoNo;
        }

        if(ultimoNo != null){

            ultimoNo.setNoProximo(novoNo);
        }

        ultimoNo = novoNo;
        tamanhoLista++;
    }

    public void add(int index, T conteudo){
        NoDuplo<T> noAuxiliar = getNo(index);
        NoDuplo<T> novoNo = new NoDuplo<>(conteudo);
        novoNo.setNoProximo(noAuxiliar);

        if (novoNo.getNoProximo() != null){

            novoNo.setNoAnterior(noAuxiliar.getNoAnterior());
            novoNo.getNoProximo().setNoAnterior(novoNo);
        } else {

            novoNo.setNoAnterior(ultimoNo);
            ultimoNo = novoNo;
        }

        if (index == 0){

            primeiroNo = novoNo;
        } else {

            novoNo.getNoAnterior().setNoProximo(novoNo);
        }

        tamanhoLista++;
    }

    public void remove(int index){
        
        if(index == 0){

            primeiroNo = primeiroNo.getNoProximo();

            if (primeiroNo != null){

                primeiroNo.setNoAnterior(null);
            }

        } else {

            NoDuplo<T> noAuxiliar = getNo(index);
            noAuxiliar.getNoAnterior().setNoProximo(noAuxiliar.getNoProximo());

            if (noAuxiliar != ultimoNo){

                noAuxiliar.getNoProximo().setNoAnterior(noAuxiliar.getNoAnterior());
            } else {

                ultimoNo = noAuxiliar;
            }

        }

        this.tamanhoLista--;
    }

    @Override
    public String toString() {
        String resultado = "";
        NoDuplo<T> noAuxiliar = primeiroNo;

        for (int i = 0; i < size(); i++) {
            
            resultado += noAuxiliar + " ---> ";
            noAuxiliar = noAuxiliar.getNoProximo();
        }

        resultado += "null";

        return resultado;
    }
    
}
