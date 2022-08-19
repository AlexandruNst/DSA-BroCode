package _17_Adjacency_List;

public class Main {
    public static void main(String[] args) {

        // Adjacency List = An array(list) of LinkedLists
        //                  Each LinkedList has a unique node as the head
        //                  All adjacent neighbours to that node are added to the LinkedList

        // T: O(V)
        // S: O(V + E)

        Graph graph = new Graph();

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
    }
}
