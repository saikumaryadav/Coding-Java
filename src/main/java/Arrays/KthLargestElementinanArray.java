package Arrays;

class KthLargestElementinanArray {
    public int findKthLargest(int[] nums, int k) {
        boolean swapped;
        for(int i=0;i<nums.length ; i++){
            swapped = false;
            for(int j = 1;j<nums.length - i; j++){
                if(nums[j] < nums[j-1]){
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                    swapped =true;
                }
            }
            if(!swapped){
                break;
            }
        }
       // System.out.println(Arrays.toString(nums));
        return nums[nums.length - k ];
       /* Arrays.sort(nums);
        return nums[nums.length - k];*/
    }
}