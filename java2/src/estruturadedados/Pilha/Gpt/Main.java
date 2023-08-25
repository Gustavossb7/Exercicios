package estruturadedados.Pilha.Gpt;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.peek());  // Output: Top element: 30

        System.out.println("Popped: " + stack.pop());       // Output: Popped: 30
        System.out.println("Popped: " + stack.pop());       // Output: Popped: 20

        System.out.println("Is empty? " + stack.isEmpty()); // Output: Is empty? false
    }
}
