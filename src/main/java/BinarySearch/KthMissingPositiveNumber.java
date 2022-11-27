package BinarySearch;

class KthMissingPositiveNumber {
     public static  int missingcount(int actual,int expected){
        return actual - expected;
    }
    public int findKthPositive(int[] A, int k) {
     /*        int start = 0, end = A.length, mid;
        while (start < end) {
            mid = (start + end) / 2;
            if (A[mid] - 1 - mid < k)
                start = mid + 1;
            else
                end = mid;
        }
        return start + k;
    }*/
        int start = 0,end = A.length -1;
        int mid =0;
        while(start <= end){
            mid = start +(end-start)/2;
            if(missingcount(A[mid], mid+1) < k){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        if(end == -1) return k;
        return A[end] + k - missingcount(A[end], end+1);
    }
}
   
   