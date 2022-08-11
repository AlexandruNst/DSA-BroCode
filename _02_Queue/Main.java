package _02_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        // Queue = FIFO
        // add    = enqueue, offer()
        // remove = dequeue, poll()
        // peek()

//        Queue<String> queue = new Queue<String>(); //Can't make a Queue object, in Java Queue is an interface!

        Queue<String> queue = new LinkedList<>(); // or Priority queue

        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");

        System.out.println(queue);

        System.out.println(queue.peek());
        System.out.println(queue);

        queue.poll();
        System.out.println(queue);

        System.out.println(queue.poll());
        System.out.println(queue);

        ///////////// Queue extends Collection class, which has some useful methods
        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
        System.out.println(queue.contains("Steve"));
    }
}
