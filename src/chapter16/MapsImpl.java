package chapter16;

import java.util.*;

public class MapsImpl {
    public static void main(String[] args) {
        Map<String, Integer> maps = new HashMap<>();
        createMaps(maps);
        display(maps);
    }

    private static void createMaps(Map<String, Integer> maps) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String");
        String input = scanner.nextLine();
        String [] token = input.split(" ");
        for (int i = 0; i < token.length ; i++) {
            String word = token[i].toLowerCase();
if (maps.containsKey(word)){
    int count = maps.get(word);
    maps.put(word,count + 1);
}
else {
    maps.put(word,1);
}
        }
    }

    private static void display(Map<String, Integer> maps) {
        Set<String> keys = maps.keySet();
        TreeSet<String> sortedKeys = new TreeSet<>(keys);
        System.out.printf("%nMap contains:%nKey\t\tValue%n");
        for (String key: sortedKeys) {
            System.out.printf("%-10s%10s%n",key,maps.get(key));

        }
        System.out.printf("%nsize:%d%nisEmpty:%b%n",maps.size(),maps.isEmpty());
    }
}
