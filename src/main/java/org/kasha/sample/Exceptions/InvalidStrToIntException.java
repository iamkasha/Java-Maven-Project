package org.kasha.sample.Exceptions;

public class InvalidStrToIntException extends RuntimeException{

   public  InvalidStrToIntException(Exception e){
//       e.printStackTrace();
       System.out.println(e);
   }

}

class Main {

    static void toInt(String s){
        try
        {
           int s1= Integer.parseInt(s);
            System.out.println(s1);
        }
        catch(NumberFormatException e) {
            throw new InvalidStrToIntException(e);
        }
    }


    public static void main(String[] args) {
        toInt("123");
        toInt("test");
    }
}
