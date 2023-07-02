package org.kasha.sample.Collectionss;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListtoArray {
    public static void main(String[] args) {
        ArrayList<String> arr4 = new ArrayList<>();
        arr4.add("Bat");
        arr4.add("Ball");
        arr4.add("Wickets");
        arr4.add("Batsman");
        arr4.add("Bowler");

        System.out.println(Arrays.toString(arr4.toArray()));
    }
}
