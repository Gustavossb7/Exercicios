package estruturadedados.Lista.Meu;

public class Principal{
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();
        lista.inserir(10);
        lista.inserir(40000);
        lista.inserir(-8);
        lista.display();
    }
}