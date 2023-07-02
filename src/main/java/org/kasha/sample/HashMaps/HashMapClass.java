package org.kasha.sample.HashMaps;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class HashMapClass {

    public static void main(String[] args) {

        HashMap<String, HashStudent> h = new HashMap<>();

        try {
            File file = new File("/Users/rajkumarkashaicloud.com/Desktop/Java Full Stack/src/HashMaps/hashstudents.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] studentData = line.split(",");

                String firstName = studentData[0];
                String lastName = studentData[1];
                float gpa = Float.parseFloat(studentData[2]);

                HashStudent student = new HashStudent(firstName, lastName, gpa);
                h.put(firstName, student);
            }

            scanner.close();
        } catch (FileNotFoundException e) {
//            e.printStackTrace();
        }

        System.out.println("Using entrySet");
        System.out.println(h.entrySet());

        System.out.println("-----------------------");

        System.out.println("using forEach");
        h.forEach((k,v) -> System.out.println(v));

        System.out.println("-----------------------");

        Iterator<String> itr = h.keySet().iterator();

        while (itr.hasNext()){
            String key = String.valueOf(itr.next());
            HashStudent value = h.get(key);
            System.out.println(value);
        }

    }
}
