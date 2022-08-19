package _16_Adjacency_Matrix;

public class Main {
    public static void main(String[] args) {
        // Adjacency matrix = a 2D array that stores 1s and 0s to represent edges
        //   A B C D E
        // A 0 1 0 0 0
        // B 0 0 1 0 0
        // C 0 0 0 1 1
        // D 0 0 0 0 0
        // E 1 0 1 0 0

        // T: O(1) to check an edge, simply go to the matrix position
        // S: O(V^2) where v is the number of vertices (nodes)

        Graph graph = new Graph(5);

        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));
        graph.addNode(new Node('E'));

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(4, 0);
        graph.addEdge(4, 2);

        graph.print();

        System.out.println(graph.checkEdge(3, 2));
        System.out.println(graph.checkEdge(0, 1));
    }
}
