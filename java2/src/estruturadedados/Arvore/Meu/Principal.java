package estruturadedados.Arvore.Meu;

public class Principal {
    public static void main(String[] args) {
        ArvoreBinaria ab = new ArvoreBinaria();

        ab.insert(10);
        ab.insert(20);
        ab.insert(40);
        ab.insert(15);
        ab.insert(10);
        ab.insert(80);
        ab.insert(70);

        ab.inorderTraversal();

    }
}
