package fila;

public class No<T> {
    
    private T object;
    private No<T> refNo;

    public No(T object){

        this.refNo = null;
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    public No<T> getRefNo() {
        return refNo;
    }

    public void setRefNo(No<T> refNo) {
        this.refNo = refNo;
    }

    public void setObject(T object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return object + "";
    }
}
