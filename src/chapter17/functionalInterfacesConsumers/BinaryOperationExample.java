package chapter17.functionalInterfacesConsumers;

import java.util.function.BinaryOperator;

public class BinaryOperationExample {
    public static void main(String[] args) {
        BinaryOperator<String> binaryOperator = (String name, String word)-> name + word;

        System.out.println(binaryOperator.apply("semicolon", "Africa"));
    }
}
