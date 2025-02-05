import java.util.Arrays;
import java.util.List;
import java.util.Iterator;

public class Iterators {
    public static void main(String[] args) {
        List<String> myList = Arrays.asList("apple", "banana", "cherry");

        Iterator<String> iterator = myList.iterator();
        while (iterator.hasNext()) {
        String item = iterator.next();
        System.out.println(item);
        }
    }
}