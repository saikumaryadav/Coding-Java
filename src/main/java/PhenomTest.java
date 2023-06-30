public class PhenomTest{

    public static void main(String[] args) {

     String str1 = "phenom";
     System.out.println(str1.hashCode());
     str1 = str1+"123";
        System.out.println(str1.hashCode());
        String input = "abbbccdddffaaaac";
        String result = "";
        //    o/p: abcdfac
        for(int i=0; i<input.length()-1 ; i++){

            if(input.charAt(i) !=input.charAt(i+1)){
                result = result + input.charAt(i);
            }
        }
        if(input.charAt(input.length()-2) != input.charAt(input.length()-1)){
            result= result+input.charAt(input.length()-1);
        }
        System.out.println("Result : "+result);

    }



}
