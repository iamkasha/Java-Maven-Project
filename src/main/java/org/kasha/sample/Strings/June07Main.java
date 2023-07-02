package Strings;

public class June07Main {
    public static void main(String[] args) {
//        Vowels v = new Vowels();
//        System.out.println(v.findVowels("Uday Kumar Kasha"));                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     `

//        Anagram a1 = new Anagram();
//        a1.findAnagram("Bread","Beard");

//        ReverseWord r1 = new ReverseWord();
//        r1.reverseEachWord("Java J2EE Reverse Me");

        RotateString rotate1 = new RotateString();
        String s1 = "JavaJ2eeStrutsHibernate";
        String s2 = "StrutsHibernateJavaJ2ee";
        System.out.println(rotate1.rotatedString(s1,s2));
    }
}
