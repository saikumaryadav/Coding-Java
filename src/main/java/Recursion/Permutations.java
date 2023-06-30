package Recursion;

import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        String up = "abc";
        String p = "";
        permutation(p,up);
    }

    private static void permutation(String p, String up) {
        if(up.isEmpty()){
            System.out.println(p);
        }
        int size = p.length() + 1;
        for(int i=0; i<size;i++){
            permutation(up.charAt(i)+p, up.substring(1));
        }
    }
}
