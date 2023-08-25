package estruturadedados.Arvore.Meu;

public class NodoArvore {
    int data;
    NodoArvore esquerda;
    NodoArvore direita;
    
    public NodoArvore(int data){
        this.data = data;
        this.esquerda = null;
        this.direita = null;
    }
}
