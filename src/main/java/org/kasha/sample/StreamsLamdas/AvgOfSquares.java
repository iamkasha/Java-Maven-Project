package StreamsLamdas;

import java.util.Arrays;
import java.util.OptionalDouble;

public class AvgOfSquares {
    public static void main(String[] args) {
        Integer[] numbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

       double average = Arrays.stream(numbers)
                .filter(n -> n % 2 != 0)
                .mapToDouble(n -> Math.pow(n, 2))
                .average().getAsDouble();
        System.out.println("Average of squares of odd numbers: " + average);
    }
}
