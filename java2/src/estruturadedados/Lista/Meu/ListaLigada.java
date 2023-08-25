package estruturadedados.Lista.Meu;

public class ListaLigada{
    private Nodo head;

    public ListaLigada(){
        this.head = null;
    }

    public void inserir(int dado){
        Nodo newNodo = new Nodo(dado, head);
        if(head == null){
            head = newNodo;
        }
        else{
            newNodo.next = head;
            head = newNodo;
        }
    }

    public void display(){
        Nodo nodoAtual = head;
        while(head != null){
            System.out.println(nodoAtual.data + " ");
            nodoAtual = nodoAtual.next;
        }
    }


}