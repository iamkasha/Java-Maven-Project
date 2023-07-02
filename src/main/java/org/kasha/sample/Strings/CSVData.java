package Strings;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class CSVData {
    public static void main(String[] args) throws FileNotFoundException {

        File f = new File("/Users/rajkumarkashaicloud.com/Desktop/Java Full Stack/src/June07/kasha.csv");
        Scanner sc = new Scanner(f);
        String l;

        Student[] student = new Student[11];
        int i = 0;
        while(sc.hasNextLine()){
            l = sc.nextLine();
            String[] lines = l.split(",");
            String firstName = lines[0];
            String lastName = lines[1];
            float gpa = Float.parseFloat(lines[2]);
            student[i] = new Student(firstName, lastName, gpa);
            i++;
        }

        Arrays.sort(student);


        for (Student s:
             student) {
            System.out.println(s);
        }
    }
}

