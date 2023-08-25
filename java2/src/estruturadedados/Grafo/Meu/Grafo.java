package estruturadedados.Grafo.Meu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Grafo {
    private Map<Integer, List<Integer>> adjacencyList;

    public Grafo(){
        adjacencyList = new HashMap<>();
    }

    public void addVertex(int vertex) {
        adjacencyList.put(vertex, new ArrayList<>());
    }

    public void addEdge(int vertex1, int vertex2) {
        adjacencyList.get(vertex1).add(vertex2);
        adjacencyList.get(vertex2).add(vertex1);
    }

    public List<Integer> getAdjacentVertices(int vertex) {
        return adjacencyList.get(vertex);
    }

    public void displayGraph() {
        for (Map.Entry<Integer, List<Integer>> entry : adjacencyList.entrySet()) {
            System.out.print("O vertice " + entry.getKey() + " é adjacente a: ");
            for (int adjacentVertex : entry.getValue()) {
                System.out.print(adjacentVertex + " ");
            }
            System.out.println();
        }
    }
}
