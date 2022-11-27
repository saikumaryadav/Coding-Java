package Arrays;

class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       
        int[] res = new int[m+n];
        int fi = 0;
        int si = 0;
      int index = 0;
        while(fi < m && si <n){
            if(nums1[fi] <= nums2[si]){
                res[index++] = nums1[fi];
                fi++;
            } else if(nums1[fi] > nums2[si] ){
                res[index++] =  nums2[si];
                si++;
            }
        }
      //  System.out.println(Arrays.toString(res));
      
        while(fi < m){
            res[index++] = nums1[fi];
            fi++;
        }
      
        while(si < n){
            res[index++] = nums2[si];
            si++;
        }
      //  nums1 = res;
        for(int i = 0;i <res.length; i++){
            nums1[i] = res[i];
        }
      //  System.out.println(Arrays.toString(nums1));
    }
}