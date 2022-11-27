package Maths;

class ProductofArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int temp = 1;
        int[] res = new int[nums.length];
        
        for(int i=0;i<res.length ; i++){
            res[i] = temp;
            temp = temp * nums[i];
        }
        temp = 1;
        for(int i= res.length-1 ; i>=0 ; i--){
            res[i] = res[i] * temp;
            temp = temp * nums[i];
        }
        return res;
    }
}