package Strings;

public class Vowels {
    int count = 0;
    public int findVowels(String s){
        int size = s.length();
        s = s.toLowerCase();
        for (int i=0; i<size; i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e'|| s.charAt(i) == 'i'|| s.charAt(i) == 'o'|| s.charAt(i) == 'u'){
                count++;
            }
        }
        return count;
    }
}
