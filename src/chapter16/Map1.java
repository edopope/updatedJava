package chapter16;

import java.util.HashMap;
import java.util.Map;

public class Map1 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("Amirah", 50);
        map.put("shepard", 60);
        map.put("Balablu", 150);
        System.out.println(map);

        Integer AmirahAge = map.get("Amirah");
        System.out.println("AmirahAge "+AmirahAge+ " years");
        System.out.println(map.getOrDefault("Amirah", 80));
        System.out.println(map.values());
    }
}
