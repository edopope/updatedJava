package chapter17.functionalInterfacesConsumers;

import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {
        BiConsumer<String,Integer> biConsumer = (String name, Integer age)->{
            System.out.println(name + " is  " + age + " years old");
        };
        biConsumer.accept("Godwin",29);
    }
}
