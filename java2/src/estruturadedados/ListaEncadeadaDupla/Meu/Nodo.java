package estruturadedados.ListaEncadeadaDupla.Meu;

public class Nodo{
    int dado;
    Nodo next;
    Nodo prev;

    Nodo(int dado){
        this.dado = dado;
        this.next = null;
        this.prev = null;
    }
}