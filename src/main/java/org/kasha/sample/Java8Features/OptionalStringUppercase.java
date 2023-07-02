package org.kasha.sample.Java8Features;
import java.util.Optional;
public class OptionalStringUppercase {
    public static Optional<String> toUpperCase(Optional<String> inputOptional) {
        return inputOptional.map(String::toUpperCase);
    }

    public static void main(String[] args) {
        Optional<String> input1 = Optional.of("hello");
        Optional<String> input2 = Optional.empty();

        Optional<String> result1 = toUpperCase(input1);
        Optional<String> result2 = toUpperCase(input2);

        System.out.println("Result 1: " + result1.orElse("Empty"));
        System.out.println("Result 2: " + result2.orElse("Empty"));
    }
}

