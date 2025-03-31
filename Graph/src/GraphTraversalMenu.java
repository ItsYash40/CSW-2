import java.util.*;

public class GraphTraversalMenu {
    private int vertices;
    private LinkedList<Integer>[] adjacencyList;

    GraphTraversalMenu(int v) {
        vertices = v;
        adjacencyList = new LinkedList[v];
        for (int i = 0; i < v; ++i) {
            adjacencyList[i] = new LinkedList<>();
        }
    }

    void addEdge(int v, int w) {
        adjacencyList[v].add(w);
        adjacencyList[w].add(v); 
        System.out.println("Edge added between " + v + " and " + w);
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
        System.out.println();
    }

    void DFS(int startVertex) {
        boolean[] visited = new boolean[vertices];
        System.out.println("DFS Traversal starting from vertex " + startVertex + ":");
        DFSUtil(startVertex, visited);
        System.out.println();
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
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of vertices in the graph: ");
        int v = scanner.nextInt();
        GraphTraversalMenu graph = new GraphTraversalMenu(v);
        
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Edge");
            System.out.println("2. BFS Traversal");
            System.out.println("3. DFS Traversal");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1: 
                    System.out.print("Enter source vertex: ");
                    int src = scanner.nextInt();
                    System.out.print("Enter destination vertex: ");
                    int dest = scanner.nextInt();
                    if (src >= v || dest >= v || src < 0 || dest < 0) {
                        System.out.println("Invalid vertices! Try again.");
                    } else {
                        graph.addEdge(src, dest);
                    }
                    break;
                    
                case 2: 
                    System.out.print("Enter starting vertex for BFS: ");
                    int bfsStart = scanner.nextInt();
                    if (bfsStart >= v || bfsStart < 0) {
                        System.out.println("Invalid vertex! Try again.");
                    } else {
                        graph.BFS(bfsStart);
                    }
                    break;
                    
                case 3:
                    System.out.print("Enter starting vertex for DFS: ");
                    int dfsStart = scanner.nextInt();
                    if (dfsStart >= v || dfsStart < 0) {
                        System.out.println("Invalid vertex! Try again.");
                    } else {
                        graph.DFS(dfsStart);
                    }
                    break;
                    
                case 4: 
                    System.out.println("Exiting program...");
                    scanner.close();
                    System.exit(0);
                    break;
                    
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}