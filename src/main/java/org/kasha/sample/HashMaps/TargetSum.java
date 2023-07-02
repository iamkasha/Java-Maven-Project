package HashMaps;
import java.util.HashMap;
public class TargetSum {
    public static void main(String[] args) {

        TargetSum obj = new TargetSum();
        int[] numArr = {10,20,30,40,50,60};
        obj.targetSumIndex(numArr, 100);

    }
    public void targetSumIndex(int[] arr, int target){
        HashMap<Integer, Integer> h = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]+arr[j] == target){
                    h.put(arr[i], i);
                    h.put(arr[j], j);
                }
            }
        }
        System.out.println(h.values());
    }
}
