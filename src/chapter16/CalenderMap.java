package chapter16;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class CalenderMap {
    public static void main(String[] args) {
        Map<String, Integer> calender = Map.of(
                "january",31,
                "febuary",28,
                "march",31,
                "april",30,
                "may",30
        );
        for (int keys : calender.values()) {
            System.out.println(keys);
        }

        List<String> names = new LinkedList<>();
        //List<String> AnotherNames = new LinkedList<>();
        names.add("balabu");
        names.add("bal");
        names.add("abu");
        Collections.reverse(names);

//        for (int i = 0; i < names.size() -1 ; i++) {
//
//        }
            System.out.println(names);
        }

}
