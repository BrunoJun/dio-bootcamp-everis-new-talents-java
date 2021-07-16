package introducaoAoCursoEConceitosBasicos.encadeamentoNo;

public class No<T> { // Utilizando o T significa que a classe recebe qualquer tipo de parametro.
    
    private T conteudo;
    private No<T> proximo;

    public No(T conteudo){
        this.proximo = null;
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public No<T> getProximo() {
        return proximo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public void setProximo(No<T> proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        return conteudo + "";
    }
}
