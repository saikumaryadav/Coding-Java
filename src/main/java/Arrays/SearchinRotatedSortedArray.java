package Arrays;

class SearchinRotatedSortedArray {
    public int search(int[] nums, int target) {
         /* Bruit force approach 
       ArrayList<Integer> list = new ArrayList<>();
        for(int i: nums){
            list.add(i);
        }
        if(list.contains(target)){
            return list.indexOf(target);
        }else{
            return -1;
        }*/
        
        int peak = searchPeak(nums);
        int firstHalf = -1;
        firstHalf = binarySearch(nums, 0, peak, target);
        if(firstHalf == -1){
            int secondHalf = -1;
            secondHalf = binarySearch(nums, peak+1, nums.length-1, target);

            return secondHalf;
        }else{
            return firstHalf;
        }
      //  return -1;
        
      
    }
    public static int searchPeak(int[] nums){
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = (start +end) / 2;
            //4 cases
            //1. if mid element greater than mid +1 element  [4,5,6,7,1,2,3] mid = 7
            if(mid < end && nums[mid] > nums[mid+1]){
               return mid;
            } 
            //2. if mid is smaller than its previous element [4,5,6,7,1,2,3] mid = 1
            if(mid > start && nums[mid - 1] > nums[mid] ){
                return mid - 1;
            }
            //3. if start element is greater or equal [3,2]
            if(nums[start] >= nums[mid]) {
                end = mid - 1;
            } else{ //[1,2,3]
                start = mid + 1;
            }
        }
        return start;
    }
    public int binarySearch(int[] nums, int start, int end, int target){
        while(start <= end){
            int mid = (start +end)/2;
            if(nums[mid] == target){
                return mid;
            } else if(nums[mid] > target){
                end = mid -1;
            } else if(nums[mid] < target){
                start = mid + 1;
            }
        }
        return -1;
    }
}