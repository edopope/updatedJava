package chapter17.functionalInterfacesConsumers;

import java.util.function.Consumer;

public class Example1 {
    public static void main(String[] args) {
        Consumer<Integer> consumer = (Integer number)-> System.out.println("number passed " + number);
        consumer.accept(9);
    }
}
