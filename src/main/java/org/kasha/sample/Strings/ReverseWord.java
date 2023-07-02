package org.kasha.sample.Strings;

//input - "Java J2EE Reverse Me"
//output - "avaJ EE2J esreveR eM"
public class ReverseWord {
    public void reverseEachWord(String s) {
        String[] sp = s.split(" ");
        String[] temp = new String[sp.length];
        for(int i=0; i<sp.length; i++){
            StringBuilder sb = new StringBuilder(sp[i]);
            sb = sb.reverse();
            temp[i] = String.valueOf(sb);
        }
        System.out.println("Original string: " + s);
        System.out.print("Reversed each word in the sentence: ");
        for (String value : temp) {
            System.out.print(value + " ");
        }
    }

}
