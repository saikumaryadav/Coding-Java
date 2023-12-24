package Arrays;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] a = {6, 5, 4, 2, 21, 78};
        for (int i = 1; i < a.length; i++) {

            int j = i - 1;
            int key = a[i];

            while(j>=0 && key <a[j]){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = key;

        }
        System.out.println(Arrays.toString(a));
    }
}
