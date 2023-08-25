package estruturadedados.Pilha.Meu;

public class Pilha {
    private int tamMax;
    private int topo;
    private int[] array;

    public Pilha(int tamMax){
        this.tamMax = tamMax;
        this.topo = -1;
        this.array = new int[tamMax];
    }

    public boolean isEmpty(){
        return topo ==  - 1;
    }

    public boolean isFull(){
        return topo == tamMax - 1;
    }

    public void push(int data){ //insere elemento na pilha
        if (isFull()){
            System.out.println("A pilha está cheia, não da pra botar mais");
            return;
        }
        array[++topo] = data;
    }

    public int pop(){ //remove elemento da pilha
        if (isEmpty()){
            throw new IllegalStateException("A pilha está vazia");
        }
        return array[topo--];
    }

    public int peek() { //retorna o elemento do topo da pilha
        if (isEmpty()){
            throw new IllegalStateException("A pilha está vazia");
        }
        return array[topo];
    }

}
