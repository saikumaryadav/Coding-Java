package Recursion;

public class Basic {
    public static void main(String[] args) {
        int n =1;
        print(n);
    }

    private static void print(int n) {
        if (n == 5){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print(n+1);
    }

}
