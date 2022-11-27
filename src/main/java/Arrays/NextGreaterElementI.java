package Arrays;

import java.util.*;
class NextGreaterElementI {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        Stack<Integer> stack = new Stack<>();
        Map<Integer,Integer> map = new HashMap<>();
        stack.push(nums2[0]);
        for(int i=1;i<nums2.length ; i++){
            if(!stack.isEmpty() &&(Integer)stack.peek() <= nums2[i]){
              /*  map.put((Integer)stack.peek(), nums2[i]);
                stack.pop();*/
               
                while(!stack.isEmpty() &&(Integer)stack.peek() <= nums2[i]){
                     map.put((Integer)stack.peek(), nums2[i]);
                stack.pop();
                }
                 stack.push(nums2[i]);
                
            } else{
                stack.push(nums2[i]);
            }
        }
        while(!stack.isEmpty()){
            map.put(stack.pop(),-1);
        }
//        System.out.println(map);
        for(int i=0;i<nums1.length;i++){
            res[i] = map.get(nums1[i]);

        }
        return res;
    }
}