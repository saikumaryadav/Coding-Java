package Maths;

class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
      int i = 0;
        while(nums.length > i){
            int correctIndex = nums[i] - 1;
            if(correctIndex < nums.length && nums[i] > 0 && nums[i] != nums[correctIndex]){
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            } else{
                i++;
            }
        }
        for(int j = 0; j<nums.length ; j++){
            if(nums[j] != j+1){
                return j+1;
            }
        }
      
        return nums.length+1;
    }
}
