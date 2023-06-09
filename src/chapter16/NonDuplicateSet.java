package chapter16;

import java.util.*;

public class NonDuplicateSet {
    public static void main(String[] args) {
        String [] name = {"gabriel","john", "issac","jeff","anthony","jenny","sharon","divine","jeff","anthony","jenny","sharon","divine"};
List<String> newList =  Arrays.asList(name);
        printNonDuplicate(newList);
    }

    private static void printNonDuplicate(List<String> anything) {
        Set<String> newSet = new TreeSet<>(anything);
        for(int i = 0; i < newSet.size(); i++){
        }
            System.out.print(newSet);
    }
}
