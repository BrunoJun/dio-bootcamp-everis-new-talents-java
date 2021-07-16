package introducaoAoCursoEConceitosBasicos.referenciaEAtribuicao;

public class MeuObj {
    
    private Integer num;

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return this.num + "";
    }
}
