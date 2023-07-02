package org.kasha.sample.Arrays;

public class ArrayRotation {

    public void rotateArray(int[] arr, int pos){
        int n = arr.length;
        int[] temp = new int[n];
        for(int i=pos; i<n; i++){
            temp[i-pos] = arr[i];
        }
        for (int j=0; j<pos; j++){
            temp[n-pos+j] = arr[j];
        }

        System.out.print("Rotated array elements :");

        for(int k=0; k< temp.length; k++){
            System.out.print(temp[k] + " ");
        }
    }

}
