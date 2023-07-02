package Arrays;
public class ReverseArray {
    public void arrayReverse(int[] arr){
        int n = arr.length;
        int[] temp = new int[n];

        for(int i=0;i<n;i++){
            temp[i] = arr[n-i-1];
        }

        System.out.print("Reversed array is:");

        for (int j=0; j<temp.length; j++){
            System.out.print(temp[j] + " ");
        }
        System.out.println("");
    }

}
