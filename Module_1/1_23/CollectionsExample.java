import java.util.*;

public class CollectionsExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");

        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 1);
        map.put("Banana", 2);

        Set<String> set = new TreeSet<>();
        set.add("Orange");
        set.add("Grape");

        System.out.println(list);
        System.out.println(map);
        System.out.println(set);
    }
}