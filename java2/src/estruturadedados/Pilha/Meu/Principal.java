package estruturadedados.Pilha.Meu;

public class Principal {
    public static void main(String[] args) {
        Pilha pilinha = new Pilha(10);

        System.out.println("A pilha está vazia? " + pilinha.isEmpty());
        pilinha.push(10);
        System.out.println(pilinha.peek());
        pilinha.push(20);
        System.out.println(pilinha.peek());
        pilinha.pop();
        System.out.println(pilinha.peek());
        System.out.println("A pilha está vazia? " + pilinha.isEmpty());

    }
}
