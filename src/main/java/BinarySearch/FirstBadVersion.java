package BinarySearch;/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

/* class FirstBadVersion extends VersionControl {
    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(isBadVersion(mid) == true){
                end = mid -1;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }
}*/