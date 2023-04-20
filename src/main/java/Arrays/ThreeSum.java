package Arrays;

import java.util.*;

//a[i] +a[j] + a[k] >= target
public class ThreeSum {
    public static void main(String[] args) {

        int[] array = {1, 12, 3, 2, 1, 4, 0, 23, 6};
        int target = 8;
        System.out.println(Arrays.toString(array));
/*      Brute force approach
        for (int i = 0; i < array.length - 2; i++) {
            for (int j = i + 1; j < array.length - 1; j++) {
                for (int k = j + 1; k < array.length; k++) {
                    if (array[i] + array[j] + array[k] <= target) {
                        System.out.println(array[i] + " " + array[j] + " " + array[k]);
                    }
                }
            }
        }*/
        for (int i = 0; i < array.length - 2; i++) {
            int left = i + 1;
            int right = array.length - 1;
            while (left < right) {
                if ((array[left] + array[right]) > (target - array[i])) {
                    if((array[left]) > (target - array[i])){
                        left++;
                    }
                    else if((array[right]) > (target - array[i])){
                        right--;
                    } else{
                        left++;
                    }

                } else {
                    System.out.println(array[i] + " " + array[left] + " " + array[right]);
                    left++;
                }
            }
        }

    }
}
