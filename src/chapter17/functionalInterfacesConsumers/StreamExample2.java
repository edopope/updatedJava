package chapter17.functionalInterfacesConsumers;

import java.util.stream.Stream;

public class StreamExample2 {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9,0);
        stream.forEach(n-> System.out.println(n));
    }
}
