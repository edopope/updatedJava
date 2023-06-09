package chapter16;

import java.util.*;

public class SetExamples {
    public static void main(String[] args) {


        List<Integer> ageOfStudents = new ArrayList<>();
        ageOfStudents.add(1);
        ageOfStudents.add(2);
        ageOfStudents.add(4);
        ageOfStudents.add(2);
        ageOfStudents.add(5);


        ageOfStudents.sort(Comparator.naturalOrder());
        System.out.println(ageOfStudents);

//        Set<Integer> set = new TreeSet<>();
//        set.add(2);
//        set.add(5);
//
//        ageOfStudents.removeAll(set);
//        System.out.println(ageOfStudents);
    }
}