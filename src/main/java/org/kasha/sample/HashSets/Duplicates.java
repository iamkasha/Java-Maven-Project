package org.kasha.sample.HashSets;

import java.util.HashSet;
import java.util.Scanner;

public class Duplicates {

    public static void main(String[] args) {
        HashSet<Character> hs = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        char[] ch = s.toCharArray();
        for(char c: ch){
            hs.add(c);
        }

        System.out.println(hs);
    }
}
