package fila;

public class Fila <T> {
    
    // A entrada é pelo final
    private No<T> refEntradaFila;

    public Fila(){

        refEntradaFila = null;
    }

    public boolean isEmpty(){

        return refEntradaFila == null ? true : false;
    }

    public void enqueue(T obj){

        No<T> novoNo = new No<>(obj);
        novoNo.setRefNo(refEntradaFila);
        refEntradaFila = novoNo;
    }

    public T first(){

        if(!this.isEmpty()){
            No<T> primeiroNo = refEntradaFila;

            while(true){

                if(primeiroNo.getRefNo() != null){

                    primeiroNo = primeiroNo.getRefNo();
                } else{

                    break;
                }

            }
            return (T) primeiroNo.getObject();
        }
        return null;
    }

    public T dequeue(){

        if(!this.isEmpty()){
            No<T> primeiroNo = refEntradaFila;
            No<T> noAuxiliar = refEntradaFila;

            while(true){

                if(primeiroNo.getRefNo() != null){

                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();
                } else{
                    noAuxiliar.setRefNo(null);
                    break;
                }
            }
            return (T) primeiroNo.getObject();
        }
        return null;
    }

    @Override
    public String toString() {
        String resultado = "";
        No<T> noAuxiliar = refEntradaFila;

        if(refEntradaFila != null){

            while(true){

                resultado += (noAuxiliar.getObject() + " ---> ");
                
                if(noAuxiliar.getRefNo() != null){
                    
                    noAuxiliar = noAuxiliar.getRefNo();
                } else {

                    resultado += "null";
                    break;
                }
            }

        } else {
            resultado = "null";
        }
        return resultado;
    }
}
