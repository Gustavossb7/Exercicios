package estruturadedados.Arvore.Meu;

public class ArvoreBinaria {
    private NodoArvore raiz;

    public ArvoreBinaria(){
        this.raiz = null;
    }

    public void insert(int data){
        raiz = insertRec(raiz, data);
    }

    private NodoArvore insertRec(NodoArvore raiz, int data){
        if (raiz == null) {
            raiz = new NodoArvore(data);
            return raiz;
        }

        if (data < raiz.data) {
            raiz.esquerda = insertRec(raiz.esquerda, data);
        } else if (data > raiz.data){
            raiz.direita = insertRec(raiz.direita, data);
        }

        return raiz;
    }

    public void inorderTraversal() {
        inorderTraversalRec(raiz);
        System.out.println();
    }

    private void inorderTraversalRec(NodoArvore raiz) {
        if (raiz != null) {
            inorderTraversalRec(raiz.esquerda);
            System.out.print(raiz.data + " ");
            inorderTraversalRec(raiz.direita);
        }
    }
}
