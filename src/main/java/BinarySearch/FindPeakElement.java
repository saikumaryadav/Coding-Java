package BinarySearch;

class FindPeakElement {
    public int findPeakElement(int[] nums) {
       int start = 0;
        int end = nums.length - 1;
        while(start < end){
            int mid = (start + end) / 2;
            //3,5,7,2,1,0,-1
            if(nums[mid] > nums[mid + 1]){
                end = mid ;
            }else if(nums[mid] < nums[mid + 1]){
                start = mid + 1;
            }
        }
        return start;
    }
}