package Arrays;

import java.util.ArrayList;
import java.util.List;

class KidsWiththeGreatestNumberofCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
       List<Boolean> res = new ArrayList<>();
        int max = 0;
        for(int i=0;i<candies.length;i++){
            max = Math.max(max, candies[i]);
        }
      //  System.out.println(max);
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies >= max){
                res.add(true);
            } else{
                res.add(false);
            }
        }
      return  res;
    }
}