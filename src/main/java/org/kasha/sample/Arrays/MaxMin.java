package org.kasha.sample.Arrays;

public class MaxMin {

        int max, min;
        public int maxArray(int[] arr) {
            max = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if(max < arr[i]){
                    max = arr[i];
                }
            }
            return max;
        }

        public int minArray(int[] arr){
            min = arr[0];
            int i=0;
            while (i < arr.length){
                if(arr[i] < min){
                    min = arr[i];
                }
                i++;
            }
            return min;
        }

}
