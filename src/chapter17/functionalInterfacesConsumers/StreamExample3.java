package chapter17.functionalInterfacesConsumers;

import java.util.stream.IntStream;

public class StreamExample3 {
    public static void main(String[] args) {
        int sum = IntStream.rangeClosed(2,20).filter((n)->n%2 == 0).sum();
        System.out.print(sum +"\n");


        int total = IntStream.rangeClosed(2,20).filter((n)->n%2 == 0).map((number)->number*number).sum();
        System.out.print(total);
    }
}
