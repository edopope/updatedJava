package chapter16;

import java.util.PriorityQueue;

public class QueueImpl {
    public static void main(String[] args) {
        PriorityQueue<String> newQueue = new PriorityQueue<>();
        newQueue.add("nana");
        newQueue.add("demo");
        newQueue.add("fame");
        System.out.println(newQueue);

    }
}
