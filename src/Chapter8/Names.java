package Chapter8;

import java.util.ArrayList;

public class Names {
    public static void main(String[] args) {
        ArrayList<String>name = new ArrayList<String>();
        name.add("godwin");
        name.add(1, "sarah");
        for (int i = 0; i < name.size() ; i++) {

            System.out.printf("the names are %s%n%n",name.get(i));

        }
    }
}