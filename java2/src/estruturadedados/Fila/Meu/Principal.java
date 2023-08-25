package estruturadedados.Fila.Meu;

public class Principal {
    public static void main(String[] args) {
        Fila filinha = new Fila();
        filinha.isEmpty();
        System.out.println(filinha.isEmpty());
        filinha.enqueue(40);
        filinha.enqueue(30);
        filinha.enqueue(20);
        System.out.println(filinha.dequeue());
        System.out.println(filinha.isEmpty());
        System.out.println(filinha.peek());


    }   
}
