package _20_Binary_Search_Tree;

public class Main {
    public static void main(String[] args) {
        // BINARY SEARCH TREE = A tree data structure, where each node is greater than
        //                      left child, and smaller than right child
        // T: O(log n) best case
        //    O(n) worst case (unbalanced is basically a list)
        // S: O(n)

        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(new Node(5));
        tree.insert(new Node(1));
        tree.insert(new Node(9));
        tree.insert(new Node(2));
        tree.insert(new Node(7));
        tree.insert(new Node(3));
        tree.insert(new Node(6));
        tree.insert(new Node(4));
        tree.insert(new Node(8));

        tree.display();
        System.out.println(tree.search(1));

        tree.remove(1);
        tree.display();
    }
}
