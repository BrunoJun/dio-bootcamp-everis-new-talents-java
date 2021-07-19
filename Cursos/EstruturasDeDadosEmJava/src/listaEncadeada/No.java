package listaEncadeada;

public class No<T> {
    
    private T conteudo;
    private No<T> proximoNo;

    public No(T conteudo){

        this.proximoNo = null;
        this.conteudo = conteudo;
    }

    public No(T conteudo, No<T> proximoNo){

        this.conteudo = conteudo;
        this.proximoNo = proximoNo;
    }

    public T getConteudo() {

        return conteudo;
    }

    public No<T> getProximoNo() {

        return proximoNo;
    }

    public void setConteudo(T conteudo) {

        this.conteudo = conteudo;
    }

    public void setProximoNo(No<T> proximoNo) {

        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        
        return conteudo + "";
    }

    public String toStringEncadeado(){
        String resultado = "";

        if(proximoNo != null){

            resultado += (" ---> " + proximoNo.conteudo);
        } else {

            resultado += " ---> null";
        }

        return resultado;
    }
}
