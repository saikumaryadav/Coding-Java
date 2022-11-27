package BinarySearch;

class ArrangingCoins {
    public int arrangeCoins(int n) {
       /* int count = 0;
        int value = n;
        for(int i =1;i<=n; i++){
            if(value - i >= 0){
                value = value - i;
                count++;
            }else{
                break;
            }
        }
        return count;*/
        long start= 0,end = n;
        long sum = 0;
        while(start <= end){
           long mid = start + (end - start)/2;
            sum = mid * (mid + 1)/2;
            if(sum == n)return (int)mid;
            else if(sum > n)end = mid - 1;
            else start = mid + 1;
        }
        return (int)end;
    }
}