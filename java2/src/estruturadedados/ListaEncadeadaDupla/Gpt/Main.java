package estruturadedados.ListaEncadeadaDupla.Gpt;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.insertFront(10);
        list.insertFront(20);
        list.insertRear(30);
        
        list.displayForward();  // Output: 20 10 30
        list.displayBackward(); // Output: 30 10 20
    }
}