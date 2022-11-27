package Maths;

class SortColor {
    public void sortColors(int[] nums) {
        
      /*  for(int i = 0; i<nums.length ;i++){
            boolean isvisited = false;
            for(int j = 1; j< nums.length - i; j++){
                if(nums[j] < nums[j-1]){
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                    isvisited = true;
                }
            }
            if(!isvisited){
                break;
            }
        }*/
      //  System.out.println(Arrays.toString(nums));
        int c1 = 0,c2= 0, c3 = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                c1++;
            }else if(nums[i] == 1){
                c2++;
            }else{
                c3++;
            }
        }
        int index = 0;
        while(c1 >0){
            nums[index++] = 0;
            c1--;
        }
        while(c2 > 0){
            nums[index++] = 1;
            c2--;
        }
        while(c3 > 0){
            nums[index++] = 2;
            c3--;
        }
    }
}