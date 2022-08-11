package _03_Priority_Queue;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        // Priority Queue = FIFO
        // however, elements are rearranged such that the elements with higher priority come first
        // then, elements with lower priority

        System.out.println("Linked list:");
        Queue<Double> queue = new LinkedList<>();

        queue.offer(3.0);
        queue.offer(2.5);
        queue.offer(4.0);
        queue.offer(1.5);
        queue.offer(2.0);

        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }

        /////
        System.out.println("\n Priority queue:");

        Queue<Double> pqueue = new PriorityQueue<>();
        //Queue<Double> pqueue = new PriorityQueue<>(Collections.reverseOrder());

        pqueue.offer(3.0);
        pqueue.offer(2.5);
        pqueue.offer(4.0);
        pqueue.offer(1.5);
        pqueue.offer(2.0);

        while(!pqueue.isEmpty()){
            System.out.println(pqueue.poll());
        }


    }
}
