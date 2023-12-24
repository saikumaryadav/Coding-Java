package Recursion;

import java.util.ArrayList;
import java.util.List;

public class ReturnArrayList {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,3,5,7,8,9,45,32};
        int target = 7;
        List<Integer> result = new ArrayList<>();
        System.out.println(ReturnIndexList(arr, target,0, result));
    }

    private static List<Integer> ReturnIndexList(int[] arr, int target, int index, List<Integer> result) {
        if(index == arr.length-1){
            return result;
        }
        System.out.println("index :; "+index);
        if(arr[index] == target){
            result.add(index);
        }
      return ReturnIndexList(arr,target, index+1, result);
    }
}
