package StreamsLamdas;

import java.util.Arrays;

public class Capitalise {
    public static void main(String[] args) {
        String[] strings = {"bat", "ball", "wickets", "players", "umpire"};

        Arrays.stream(strings)
                .sorted()
                .map(s -> Character.toUpperCase(s.charAt(0)) + s.substring(1))
                .forEach(i -> System.out.println(i));
        }
}


