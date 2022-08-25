package _18_Depth_First_Search;

public class Main {
    public static void main(String[] args) {
        // DEPTH FIRST SEARCH = Pick a route, keep going
        //                      If you reach a dead end or an already visited node,
        //                          backtrack to the closest previous node that still has
        //                          unvisited neighbours

        Graph graph = new Graph(5);

        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));
        graph.addNode(new Node('E'));

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(4, 0);
        graph.addEdge(4, 2);

        graph.print();

        graph.depthFirstSearch(3);
    }
}
