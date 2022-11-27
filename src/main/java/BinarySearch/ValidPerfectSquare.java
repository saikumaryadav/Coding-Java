package BinarySearch;

class ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {
        if(num == 1)
            return true;
        int start = 0;
        int end = num/2;
        while(start <= end){
           /*  long mid = start + (end - start) / 2;
            long sq = mid*mid;
            if(sq>num){
                end = (int)mid-1;
            }
            else if(sq<num){
                start=(int)mid+1;
            }
            else{
                return true;
            }*/
            long mid = start + (end-start) /2;
            if(mid*mid == num){
                return true;
            }else if(mid*mid > num){
                end = (int)mid -1;
            }else{
                start = (int)mid+1;
            }
        }
        return false;
    }
}