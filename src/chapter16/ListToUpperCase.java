package chapter16;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListToUpperCase {
    public static void main(String[] args) {
        String[] name  = {"uyi","glory","Abia","deborah","Micah"};
      List< String > OurNames = Arrays.asList(name);;

         toUpperCaseList(OurNames);
    }

    private static void toUpperCaseList(List<String> list) {
//        for(String names : list){
//            System.out.println(names.toUpperCase());

        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            String anything = listIterator.next();
            listIterator.set(anything.toUpperCase());
            System.out.println(anything   .toUpperCase());
        }
        }
    }
//}
