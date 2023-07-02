package org.kasha.sample.Arrays;

public class June06Main {
    public static void main(String[] args) {

        int[] a = new int[]{5,9,3,55,73,24,97,1};
        int[] b = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        MaxMin m1 = new MaxMin();
        System.out.println("Largest value in the array is " + m1.maxArray(a));
        System.out.println("Smallest value in the array is " + m1.minArray(a));


        ReverseArray r1 = new ReverseArray();
        r1.arrayReverse(a);

        ArrayRotation rotate1 = new ArrayRotation();
        rotate1.rotateArray(b,3);

    }
}
