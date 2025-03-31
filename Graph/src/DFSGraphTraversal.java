import java.util.*;

public class DFSGraphTraversal {
    private int vertices;   
    private LinkedList<Integer>[] adjacencyList; 

    DFSGraphTraversal(int v) {
        vertices = v;
        adjacencyList = new LinkedList[v];
        for (int i = 0; i < v; ++i) {
            adjacencyList[i] = new LinkedList();
        }
    }

    void addEdge(int v, int w) {
        adjacencyList[v].add(w); 
        adjacencyList[w].add(v); 
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

    public static void main(String[] args) {
        DFSGraphTraversal graph = new DFSGraphTraversal(6);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(4, 5);

        System.out.println("Depth First Search Traversal starting from vertex 0:");
        graph.DFS(0);
    }
}