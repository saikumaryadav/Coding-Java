package Maths;

class MissingNumber {
    public int missingNumber(int[] nums) {
       /* for(int i=0;i<nums.length;i++){
            
           final boolean test = IntStream.of(nums).anyMatch(x -> x == i);
            System.out.println("test :: "+test);
            if(test == false)
                return i;
        }*/
        
     /*   ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            list.add(nums[i]);
        }
        for(int i=0;i<=nums.length;i++){
            if(!list.contains(i))
                return i;
        }*/
        
        /* its not working
        for(int i=0;i<=nums.length;i++){
        boolean test = IntStream.of(nums).anyMatch(x -> x == i);
        if(!test)
            return i;
        }*/
        
        int i = 0;
        while(i < nums.length){
            int correctIndex = nums[i];
            if(correctIndex != nums.length && nums[i] != nums[correctIndex] ){
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            } else{
                i++;
            }
        }
       // System.out.println(Arrays.toString(nums));
        for(int k = 0;k<nums.length ; k++){
            if(k != nums[k] ){
                return k;
            }
        }
        
        return nums.length;
    }
}