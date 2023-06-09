package chapter17.functionalInterfacesConsumers;

import java.util.function.BiFunction;

public class FunctionExample1 {
    public static void main(String[] args) {
        BiFunction<String, Integer, Boolean> biFunction = (word, number)-> word.length() == number;
        System.out.println(biFunction.apply("godwin",8  ));
    }
}
