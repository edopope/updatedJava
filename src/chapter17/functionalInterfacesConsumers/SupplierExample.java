package chapter17.functionalInterfacesConsumers;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<Integer> supplier = ()->5;
        Supplier<Integer> supplier2 = ()-> new Random().nextInt(10);
        System.out.println(supplier.get());
        for (int i = 0; i < 10; i++) {
            System.out.println(supplier2.get() + " ");
        }
    }
}
