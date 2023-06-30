package Recursion;

public class EliminateA2 {
    public static void main(String[] args) {
        String str = "Payyavula saikumar yadav";
        System.out.println(eliminate(str));
    }

    private static String eliminate(String str) {
        String ans = "";
        if (str.isEmpty()){
            return ans;
        }
        if(str.charAt(0) != 'a'){
            ans = ans + str.charAt(0);

        }
        return ans + eliminate(str.substring(1));
    }
}
