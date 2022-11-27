package Arrays;

import java.util.ArrayList;
import java.util.List;

class IntersectionofTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        List<Integer> resList = new ArrayList<>();
        for(int i : nums1){
            list.add(i);
        }
        for(int i=0;i<nums2.length; i++){
            if(list.contains(nums2[i])){
                resList.add(nums2[i]);
                list.remove(Integer.valueOf(nums2[i]));
            }
        }
        int[] res = new int[resList.size()];
        for(int i=0;i<res.length;i++){
            res[i] = resList.get(i);
        }
        return res;
    }
}