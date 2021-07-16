package pilha;

public class Main {
    
    public static void main(String[] args) {
        
        Pilha p1 = new Pilha();

        p1.push(1);
        p1.push(2);
        p1.push(3);
        p1.push(4);
        p1.push(5);
        p1.push(6);
        p1.pop();
        p1.push(7);
        
        System.out.println(p1);

        System.out.println(p1.top());
    }
}
