package _19_Breadth_First_Search;

public class Main {
    public static void main(String[] args) {

        // BREADTH FIRST SEARCH   = Traverse a graph level by level
        //                          Utilise a Queue
        //                          Siblings are visited before children
        //                          Better if destination is on average close to start

        // vs.

        // DEPTH FIRST SEARCH     = Traverse the graph branch by branch
        //                          Utilise a stack (call stack if using recursion)
        //                          Children are visited before siblings
        //                          Better if destination is on average far from start

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

        graph.breadthFirstSearch(1);
    }
}
