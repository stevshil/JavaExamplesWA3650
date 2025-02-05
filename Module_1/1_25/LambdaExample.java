import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<Integer> evenNumbers = numbers.stream()
                // filter is a higher-order function
                // that takes a lambda expression as an argument
                .filter(n -> n % 2 == 0) // Lambda expression
                .collect(Collectors.toList());

        // System.out::println is a method reference
        evenNumbers.forEach(System.out::println);
    }
}