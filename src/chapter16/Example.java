package chapter16;

import java.util.*;

public class Example {
    public static void main(String[] args) {
//        List<String> words = new ArrayList<>();
//        words.add("semicolon ");
//        words.add("batified");
//        words.add("obidient");
//        words.add("atikulate");

        Collection<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(1);
        System.out.println(numbers);
        Iterator<Integer> iterator = numbers.iterator();
          while(iterator.hasNext()){

        System.out.println(iterator.next());
        }
    }
}
