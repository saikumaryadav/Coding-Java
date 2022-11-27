package BinarySearch;

//https://leetcode.com/problems/binary-search/
public class BinarySearch {
    public int search(int[] nums, int target) {
        /**Iterative Approach Solution*/
        int left = 0;
        int right = nums.length-1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(target == nums[mid]){
                return mid;
            } else if(target > nums[mid]){
                left = mid + 1;
            } else if(target < nums[mid]){
                right = mid - 1;
            }
        }
        return -1;
    }
}
