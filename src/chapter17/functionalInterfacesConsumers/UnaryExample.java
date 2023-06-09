package chapter17.functionalInterfacesConsumers;

import java.util.function.UnaryOperator;

public class UnaryExample {
    public static void main(String[] args) {

    UnaryOperator<String> unaryOperator = (name)->String.valueOf(name.length());
        System.out.println(unaryOperator.apply("uyi"));
    }
}
