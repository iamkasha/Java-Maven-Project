package HashSets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class HashSetClass {

    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("Rohit");
        hs.add("Gill");
        hs.add("Virat");
        hs.add("Pujara");
        hs.add("Rahane");
        hs.add("Pant");
        hs.add("Jadeja");
        hs.add("Ashwin");
        hs.add("Shami");
        hs.add("Siraj");

        System.out.println("Using Iterator");
        Iterator<String> itr = hs.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("-----------------------------");

        hs.forEach(s -> System.out.println(s));

        System.out.println("-----------------------------");

        hs.stream().forEach(st -> System.out.println(st));


    }
}
