import java.util.*;

public class DirectedDFSTraversal {
    private int vertices;   
    private LinkedList<Integer>[] adjacencyList; 

    DirectedDFSTraversal(int v) {
        vertices = v;
        adjacencyList = new LinkedList[v];
        for (int i = 0; i < v; ++i) {
            adjacencyList[i] = new LinkedList<>();
        }
    }

    void addEdge(int v, int w) {
        adjacencyList[v].add(w); 
    }

    void DFS(int startVertex) {
        boolean[] visited = new boolean[vertices];

        DFSUtil(startVertex, visited);
    }

    private void DFSUtil(int vertex, boolean[] visited) {
        visited[vertex] = true;
        System.out.print(vertex + " ");

        for (int neighbor : adjacencyList[vertex]) {
            if (!visited[neighbor]) {
                DFSUtil(neighbor, visited);
            }
        }
    }

    void DFSForDisconnected() {
        boolean[] visited = new boolean[vertices];
        
        for (int i = 0; i < vertices; ++i) {
            if (!visited[i]) {
                DFSUtil(i, visited);
            }
        }
    }

    public static void main(String[] args) {
        DirectedDFSTraversal graph = new DirectedDFSTraversal(6);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(4, 5);
        graph.addEdge(5, 3); 

        System.out.println("Depth First Search Traversal starting from vertex 0:");
        graph.DFS(0);

        System.out.println("\n\nDFS for entire graph (handles disconnected components):");
        graph.DFSForDisconnected();
    }
}