package Collectionss;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionsClass {
    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<>();
        arr.add("Bat");
        arr.add("Ball");
        arr.add("Wickets");
        arr.add("Batsman");
        arr.add("Bowler");

        // for loop
        System.out.println("Using for loop:");
        for(int i=0; i< arr.size(); i++){
            String s = arr.get(i);
            System.out.println(s);
        }

        // Enhanced for loop
        System.out.println("Using Enhanced for loop: ");
        for(String s: arr){
            System.out.println(s);
        }

        System.out.println("Using iterator: ");
        Iterator<String> itr = arr.iterator();

        while (itr.hasNext()){
            String st = itr.next();
            System.out.println(st);
        }

        System.out.println("Using foreach: ");
        arr.forEach(s -> System.out.println(s));

        System.out.println("Using parallel stream: ");
        arr.stream().parallel().forEach(str -> System.out.println(str));

    }

}
