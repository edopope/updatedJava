package chapter14;

import java.util.Arrays;

public class StringLoop {
    public static void main(String[] args) {
        String [] names = {"jerry", "paul", "ana", "john"};
        String s1 = "i am ";
        String s2 = "a boy";
//        for (int i = 0; i < names.length ; i++) {
//            System.out.println(names[i]);
        System.out.println(s1.concat(s2));

        for (String name:names) {
          //  System.out.println(Arrays.toString(names));
         //   System.out.println(name);
            if (name.startsWith("j")){
                System.out.println(name);

            }
        }
        }
    }

