package estruturadedados.ListaEncadeadaDupla.Meu;

public class Principal{
    public static void main(String[] args) {
        ListaEncadeadaDupla lista = new ListaEncadeadaDupla();

        lista.inserirNaFrente(10);
        lista.inserirNaFrente(20);
        lista.inserirNaFrente(30);
        lista.inserirNaFrente(40);
        lista.inserirAtras(50);
        lista.inserirAtras(60);
        lista.inserirAtras(70);
        lista.inserirAtras(80);

        System.out.println("Backward: ");
        lista.displayDeTras();
        System.out.println(" ");
        System.out.println("Forward: ");
        lista.displayDeFrente();
    }
}