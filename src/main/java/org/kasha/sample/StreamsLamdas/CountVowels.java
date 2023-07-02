package org.kasha.sample.StreamsLamdas;

import java.util.Arrays;
import java.util.stream.Stream;

public class CountVowels {
    public static void main(String[] args) {

        String[] strings = {"bat", "ball", "wickets", "players", "umpire", "sky"};

        Arrays.stream(strings).filter(s -> s.matches(".*[aeiouAEIOU]*."))
                .forEach(s ->{
                    int count = (int) s.chars()
                            .filter(i -> "[aeiouAEIOU]".contains(String.valueOf((char) i))).count();
                    System.out.println("The string is: " +s + " count: " + count);
                });
    }
}
