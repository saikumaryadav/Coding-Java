package Recursion;

import java.util.ArrayList;
import java.util.List;

// Str is "abc" -> [a,b,c,ab,ac,abc,bc]
public class StringSubset {
    public static void main(String[] args) {
        String input = "abc";
        List<String> resultList = new ArrayList<>();
        String up = "";
        subsetString(up, input, resultList);
        System.out.println(resultList);
    }

    private static void subsetString(String up, String input, List<String> list) {
        if(input.isEmpty()){
            list.add(up);
            return;
        }
        subsetString(up+input.charAt(0), input.substring(1), list);
        subsetString(up, input.substring(1), list);
    }
}
