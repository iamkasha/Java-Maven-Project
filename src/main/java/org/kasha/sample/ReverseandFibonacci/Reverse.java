package org.kasha.sample.ReverseandFibonacci;

public class Reverse {
    public void reverseNumber(int newNum) {

        int rem, rev = 0;

        while(newNum > 0) {
            rem = newNum % 10;
            newNum = newNum / 10;
            rev = rev * 10 + rem;
        }

    System.out.println(rev);

    }
}
