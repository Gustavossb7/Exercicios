package estruturadedados.Fila.Meu;

public class Fila {
    private Nodo frente;
    private Nodo atras;

    Fila(){
        this.frente = null;
        this.atras = null;
    }

    public boolean isEmpty(){ //Verifica se a fila está vazia
        return frente == null;
    }

    public void enqueue(int data){ //Adiciona um valor ao final da fila
        Nodo novoNodo = new Nodo(data);
        if(isEmpty() == true){
            frente = atras = novoNodo;
        }
        else{
            atras.next = novoNodo;
            atras = novoNodo;
        }
    }

    public int dequeue(){ //Retira o primeiro valor
        if(isEmpty()){
            throw new IllegalStateException("Queue is empty");
        }
        int data = frente.data;
        frente = frente.next;
        if(frente == null) {
            atras = null;
        }
        return data;
    }

    public int peek(){ //Retorna o primeiro valor
        if(isEmpty()){
           throw new IllegalStateException("Queue is empty");
        }
        return frente.data;
    }
}
