package estruturadedados.Grafo.Meu;

public class Principal {
   public static void main(String[] args) {
    Grafo grafo = new Grafo();

    grafo.addVertex(1);
    grafo.addVertex(2);
    grafo.addEdge(1, 2);
   

    grafo.addVertex(3);
    grafo.addEdge(1, 3);
     grafo.displayGraph();

   }   
}
