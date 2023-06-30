package Recursion;

public class EliminateA {
    public static void main(String[] args) {
        String str = "saikumar yadav";
        String ans = "";
        //System.out.println(str.substring(1));
        System.out.println(eliminate(str,ans));
    }

    private static String eliminate(String str, String ans) {
        if(str.isEmpty()){
            return ans;
        }
        if(str.charAt(0) != 'a'){
            ans = ans + str.charAt(0);
        }
       return eliminate(str.substring(1),ans);

    }
}
