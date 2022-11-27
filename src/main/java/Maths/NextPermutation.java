package Maths;

class NextPermutation {
    public void reverse( int[] nums, int start, int end){
        int temp = 0 ;
        while(start < end){
            temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    public void nextPermutation(int[] nums) {
                int pivotIndex = -1;
        for(int i = nums.length - 1 ; i>0 ;i--){
            if(nums[i]> nums[i-1]){
                pivotIndex = i-1;
                break;
            }
        }
        if(pivotIndex != -1){
        int ele =0;
        if(pivotIndex >= 0){
            for(int i = nums.length-1 ; i>=pivotIndex; i--){
                if(nums[pivotIndex] < nums[i]){
                    ele = i;
                    break;
                }
            }
        }
        int temp = nums[pivotIndex];
        nums[pivotIndex] = nums[ele];
        nums[ele] = temp;
        }
      //  System.out.println(Arrays.toString(nums));

       //System.out.println(pivotIndex);
        reverse(nums, pivotIndex + 1, nums.length-1);
       

    }
}