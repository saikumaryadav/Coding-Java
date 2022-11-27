package Maths;

class SetMismatch {
    public int[] findErrorNums(int[] nums) {
        int i = 0;
        while(nums.length > i ){
            int correctIndex = nums[i] - 1;
            if(correctIndex != nums.length && nums[i] != nums[correctIndex]){
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex]  = temp;
            } else{
                i++;
            }
        }
        int[] res = new int[2];
        int k=0;
        for(int j =0 ;j<nums.length ; j++){
            if(nums[j] != j+1){
               res[k++] = nums[j];
               res[k++] = j+1;
            }
        }
        return res;
    }
}