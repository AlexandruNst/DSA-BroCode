package _04_Linked_List;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        // LinkedList = stores Nodes in 2 parts (data + address)
        // Nodes are in non-consecutive memory locations
        // Elements are linked using pointers

        // Singly Linked List
        // [data | address] -> [data | address] -> [data | address (null)]

        // Doubly Linked List
        // [address (null) | data | address] <-> [address | data | address] <-> [address | data | address (null)]

        // Advantages:
        // 1. Dynamic Data Structure (allocates memory while running)
        // 2. Insertion and Deletion are easy and O(1)
        // 3. No/Low memory waste

        // Disadvantages
        // 1. Greater memory usage (store extra address to next node, even worse for doubly ll)
        // 2. No random access of elements (no indexing, i.e. [i])
        // 3. Accessing/searching is time-consuming O(n)

        LinkedList<String> linkedList = new LinkedList<>(); //Java defaults to DOUBLY linked list

        // treat a linkedlist as a stack
        linkedList.push("A");
        linkedList.push("B");
        linkedList.push("C");
        linkedList.push("D");
        linkedList.push("F");

        System.out.println(linkedList);

        linkedList.pop();
        System.out.println(linkedList);

        //treat it as a queue
        linkedList.clear();

        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");

        System.out.println(linkedList);

        linkedList.poll();
        System.out.println(linkedList);

        // Useful methods
        linkedList.add(4, "E");
        System.out.println(linkedList);

        linkedList.remove("E");
        System.out.println(linkedList);

        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());

        linkedList.addFirst("0");
        linkedList.addLast("G");
        System.out.println(linkedList);

        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println(linkedList);
    }
}
