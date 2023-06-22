package week5;

public class Sreten {


//String -- Find the unique
//Write a return method that can find the unique characters from the String
//Ex: unique("AAABBBCCCDEF") ==> "DEF";
    public static String uniqueChar(String str){

       String result = "";
       for(String each:str.split("")){
           int count = 0;
           for(String each1: str.split("")){
               if(each == each1){
                   count++;
               }
           }
           if(count == 1){
               result=each;
           }
       }

        return result;
    }

    //String -- Reverse
//Write a return method that can reverse String
//Ex: Reverse("ABCD"); ==> DCBA
    public static String reverseString(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }
        // System.out.println("Reversed String is: " + reversed);
        return reversed;

    }
    public static void main(String[] args) {

        System.out.println(Sreten.uniqueChar("AAABBBCCCDEF"));
        System.out.println(Sreten.reverseString("ABCD"));
    }

}



