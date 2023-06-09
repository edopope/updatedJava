package chapter16;

import java.util.*;

public class Queue1 {
    public static void main(String[] args) {
        Queue<String> fillingStation = new PriorityQueue<>();
        fillingStation.offer("toyota");
        fillingStation.offer("honda");
        fillingStation.offer("jeep");
        fillingStation.offer("kia");
        fillingStation.offer("suzuki");
        System.out.println(fillingStation);
    }
}
