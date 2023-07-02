package org.kasha.sample.Collectionss;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveLast {

    public static void main(String[] args) {
        ArrayList<String> arr2 = new ArrayList<>();
        arr2.add("Bat");
        arr2.add("Ball");
        arr2.add("Wickets");
        arr2.add("Batsman");
        arr2.add("Bowler");

        int lastIndex = arr2.size()-1;
        arr2.remove(lastIndex);
        arr2.forEach(s -> System.out.println(s));
    }
}
