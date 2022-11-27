package BinarySearch;

class FindFirstandLast_PositionofElementinSortedArray {
    public int[] searchRange(int[] nums, int target) {
      /*  int[] res = new int[2];
        int start = -1;
        int end = -1;
        for(int i=0;i<nums.length; i++){
            if(target == nums[i]){
                if(start == -1){
                    start = i;
                }
                end = i;
            }
        }
        res[0] = start;
        res[1] = end;
        return res;*/
        int[] res = new int[2];
        res[0] = search(nums, target, true);
        if(res[0] != -1)
         res[1] = search(nums, target, false);
        else
            res[1] = -1;
        
        return res;
    }
    public static int search(int[] arr, int target, boolean isFirst){
        int ans = -1;
        int start = 0;
        int end = arr.length -1;
        while(start <= end){
            int mid = (start + end) / 2;
            if(target > arr[mid]){
                start = mid +1;
            } else if(target < arr[mid]){
                end = mid - 1;
            } else{
                ans = mid;
                if(isFirst){
                    end = mid - 1;
                } else{
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}