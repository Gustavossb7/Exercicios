package estruturadedados.ListaEncadeadaDupla.Meu;

public class ListaEncadeadaDupla{
    private Nodo head;
    private Nodo tail;

    public ListaEncadeadaDupla(){
        this.head = null;
        this.tail = null;
    }

    void inserirNaFrente(int dado){
        Nodo novoNodo = new Nodo(dado);
        if(head == null){
            head = tail = novoNodo;
        }
        else{
            novoNodo.next = head;
            head.prev = novoNodo;
            head = novoNodo;
        }
    }


    void inserirAtras(int dado){
        Nodo novoNodo = new Nodo(dado);
        if(head == null){
            head = tail = novoNodo;
        }
        else{
            tail.next = novoNodo;
            novoNodo.prev = tail;
            tail = novoNodo;
        }
    }

    void displayDeTras(){
        Nodo nodoAtual = tail;
        while(nodoAtual != null){
            System.out.print(nodoAtual.dado + " ");
            nodoAtual = nodoAtual.prev;
        }
        System.out.println();
    }

    void displayDeFrente(){
        Nodo nodoAtual = head;
        while(nodoAtual != null){
            System.out.print(nodoAtual.dado+ " ");
            nodoAtual = nodoAtual.next;
        }
        System.out.println();
    }
   
}