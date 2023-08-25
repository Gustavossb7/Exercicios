package estruturadedados.Pilha.Gpt;

public class Stack {
    private int maxSize;
    private int top;
    private int[] array;

    public Stack(int maxSize) {
        this.maxSize = maxSize;
        this.top = -1;
        this.array = new int[maxSize];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + data);
            return;
        }
        array[++top] = data;
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return array[top--];
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return array[top];
    }
}