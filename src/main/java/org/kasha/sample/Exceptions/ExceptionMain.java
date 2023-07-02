package org.kasha.sample.Exceptions;

public class ExceptionMain {
    public static void main(String[] args) throws Exception {
        ExceptionSample ex = new ExceptionSample();
        try {
            System.out.println(ex.stringToInt("23"));
//            ex.stringToInt("45.67");
            System.out.println(ex.stringToInt("test"));
//            ex.stringToInt("123f");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
