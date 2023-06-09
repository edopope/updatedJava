package chapter16;

import java.util.ArrayList;
import java.util.List;

public class ListImpl {
    public static void main(String[] args) {
        String [] name = {"gabriel","john", "issac","jeff","anthony","jenny","sharon","divine"};
        List<String> newName = new ArrayList<>();
        for (int i = 0; i < name.length ; i++) {

        newName.add(name[i]);
        }
        System.out.println(newName);
    }
}
