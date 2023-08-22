package estruturadedados.Fila;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Front element: " + queue.peek());  // Output: Front element: 10

        System.out.println("Dequeued: " + queue.dequeue());   // Output: Dequeued: 10
        System.out.println("Dequeued: " + queue.dequeue());   // Output: Dequeued: 20

        System.out.println("Is empty? " + queue.isEmpty());    // Output: Is empty? false
    }
}