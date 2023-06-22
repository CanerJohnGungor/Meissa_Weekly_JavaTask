package week5;
public class Ihsan {
    public static void main(String[] args) {

        /*
        String -- Find the unique
        Write a return method that can find the unique characters from the String
        Ex: unique("AAABBBCCCDEF") ==> "DEF";
         */

        String str = "AAABBBCCCDEF";

        String unique = "";

        for (int i = 0; i < str.length(); i++) { // i: index numbers of str
            char each = str.charAt(i);

            if(str.indexOf(each) == str.lastIndexOf(each)  ){
                unique += each;
            }

        }

        System.out.println(unique);



        System.out.println("-------------------------------------------------");


        /*
        String -- Reverse
        Write a return method that can reverse String
        Ex: Reverse("ABCD"); ==> DCBA
         */

        String reversed = "";  // to contain all the characters of the given string in reversed order

        for (int i = str.length() - 1; i >= 0; i--) { // i: index number of the given string starting from last index to index 0
            reversed += str.charAt(i);  // to get each character of the string starting from last index to index zero
        }

        System.out.println(reversed);
    }
}










