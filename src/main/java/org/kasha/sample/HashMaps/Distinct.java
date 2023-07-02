package HashMaps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class Distinct {
    public static void main(String[] args) {

        LinkedHashMap<Character, Integer> ans = new LinkedHashMap<>();
        String input = "test string";
        char[] charArr = input.toLowerCase().toCharArray();

        for(int i=0; i<input.length(); i++){
             if(charArr[i] != ' ') {
                 if (ans.containsKey(charArr[i])) {
                     int counter = ans.get(charArr[i]);
                     ans.put(charArr[i], counter + 1);
                 } else {
                     ans.put(charArr[i], 1);
                 }
             }
        }

        Iterator<Character> itr = ans.keySet().iterator();
        while (itr.hasNext()){
            Character key = itr.next();
            Integer value = ans.get(key);
            System.out.println(key + "-" + value);
        }
    }
}
