import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ForEach {
    public static void main(String[] args) {
        List<String> myList = Arrays.asList("apple", "banana", "cherry");
        for (String item : myList) {
        System.out.println(item);
        }
    }
}