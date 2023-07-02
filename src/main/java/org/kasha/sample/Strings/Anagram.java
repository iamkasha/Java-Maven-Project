package org.kasha.sample.Strings;


import java.util.Arrays;

public class Anagram {
    public void findAnagram(String s1, String s2){
        char[] c1 = s1.toLowerCase().toCharArray();
        char[] c2 = s2.toLowerCase().toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);
        System.out.println(c1);
        System.out.println(c2);
        if (Arrays.equals(c1,c2)){
            System.out.println("Anagrams");
        }else {
            System.out.println("Not anagrams");
        }

    }
}
