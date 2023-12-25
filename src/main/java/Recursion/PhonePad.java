package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PhonePad {
    public static void main(String[] args) {
        //int a = '1' - '0';
        //System.out.println(Integer.parseInt(String.valueOf('0')));
        System.out.println((char) (22 + 'a'));
        List<String> result = pad("12", "");
        System.out.println("result :: " + result);
    }

    static List<String> pad(String up, String p) {
        if (up.isEmpty()) {
            List<String> list = new ArrayList<>();
            System.out.println(p);
            list.add(p);
            return list;
        }

        int digit = up.charAt(0) - '0';
        //    System.out.println("d is :: "+digit);
        List<String> result = new ArrayList<>();
        for (int i = (digit - 1) * 3; i < (digit * 3); i++) {
            // System.out.println((char)( 97 + i));
            char ch = (char) (97 + i); // u can use 'a' also instead of 97
            result.addAll(pad(up.substring(1), p + ch));
        }
        return result;
    }
}
