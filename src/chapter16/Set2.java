package chapter16;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set2 {
    public static void main(String[] args) {
        Set<String> states = new TreeSet<>();
        states.add("Abia");
        states.add("Bauchi");
        states.add("Zamfara");
        states.add("Borno");
        System.out.println("states::"+ states);
    }
}
