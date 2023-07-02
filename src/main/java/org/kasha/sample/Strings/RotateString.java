package Strings;

public class RotateString {
    //input - "JavaJ2eeStrutsHibernate", "StrutsHibernateJavaJ2ee"
    //output - true
    public boolean rotatedString(String s1, String s2) {
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        String temp;
        if (s1.length() != s2.length() || s1.equals(s2)) {
            return false;
        }
        temp = s1.concat(s1);
        if(temp.contains(s2)){
            return true;
        }else{
            return false;
        }
    }
}
