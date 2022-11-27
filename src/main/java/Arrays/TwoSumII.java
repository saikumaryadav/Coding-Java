package Arrays;

import java.util.HashMap;

class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
       /* int end = numbers.length - 1;
        for(int i = 0;i<numbers.length ; i++){
            int start = i+1;
            while(start <= end){
                int mid = (start + end)/2;
                if(numbers[i] + numbers[mid] == target){
                    return new int[] {i+1, mid+1};
                } else if(numbers[i] + numbers[mid] < target){
                    start = mid +1;
                }else{
                    end = mid - 1;
                }
            }
        }
        return new int[]{1,2};*/
        int[] res= new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(numbers[0], 0);
        for(int i = 1;i<numbers.length ; i++){
            if(map.containsKey(target - numbers[i])){
                res[0] = map.get(target - numbers[i])+1;
                res[1] = i+1;
            }else{
                map.put(numbers[i], i);
            }
        }
        return res;
    }
}