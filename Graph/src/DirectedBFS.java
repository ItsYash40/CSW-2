import java.util.*;

public class DirectedBFS {
    private int vertices;  
    private LinkedList<Integer>[] adjacencyList; 

    DirectedBFS(int v) {
        vertices = v;
        adjacencyList = new LinkedList[v];
        for (int i = 0; i < v; ++i) {
            adjacencyList[i] = new LinkedList<>();
        }
    }

    void addEdge(int v, int w) {
        adjacencyList[v].add(w); 
    }

    void BFS(int startVertex) {
        boolean[] visited = new boolean[vertices];

        Queue<Integer> queue = new LinkedList<>();

        visited[startVertex] = true;
        queue.add(startVertex);

        System.out.println("BFS Traversal starting from vertex " + startVertex + ":");
        
        while (!queue.isEmpty()) {
            int currentVertex = queue.poll();
            System.out.print(currentVertex + " ");

        
            for (int neighbor : adjacencyList[currentVertex]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    void BFSForDisconnected() {
        boolean[] visited = new boolean[vertices];
        
        System.out.println("\nBFS for entire graph (handles disconnected components):");
        
        for (int i = 0; i < vertices; ++i) {
            if (!visited[i]) {
                Queue<Integer> queue = new LinkedList<>();
                visited[i] = true;
                queue.add(i);
                
                while (!queue.isEmpty()) {
                    int currentVertex = queue.poll();
                    System.out.print(currentVertex + " ");
                    
                    for (int neighbor : adjacencyList[currentVertex]) {
                        if (!visited[neighbor]) {
                            visited[neighbor] = true;
                            queue.add(neighbor);
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        DirectedBFS graph = new DirectedBFS(6);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(4, 5);
        graph.addEdge(5, 3); 

        graph.BFS(0);

        graph.BFSForDisconnected();
    }
}