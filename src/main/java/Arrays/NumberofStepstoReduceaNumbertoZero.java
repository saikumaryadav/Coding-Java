package Arrays;

class NumberofStepstoReduceaNumbertoZero {
    public int numberOfSteps(int num) {
        int count = 0;
        return count(num,count);
    }
    public int count(int num, int count){
        if(num == 0){
            return count;
        }
        if((num & 1) == 0){
            return count(num/2, ++count);
        }
            return count(num - 1, ++count);
        
    }
}