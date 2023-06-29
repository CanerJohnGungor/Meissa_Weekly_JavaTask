package week5;

public class Caner {

    public static String uniqueChars(String str) {
        String result = "";
        for (String eachCh : str.split("")) {
            int count = 0;
            for (String compareCh : str.split("")) {
                if (eachCh.equals(compareCh)) {
                    count++;
                }
            }
            if (count == 1) {
                result += eachCh;
            }
        }

        return result;
    }

    //String -- Reverse
    //Write a return method that can reverse String Ex: Reverse("ABCD"); ==> DCBA
    public static String reverse(String str) {
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);

        }


        return reversed;
    }


    public static void main(String[] args) {

        System.out.println("uniqueChars(\"ABCGDDSDDSK\") = " + uniqueChars("AAABBBCCCDEF"));

        System.out.println(reverse("abcd"));

    }

}
/*
String -- Find the unique
Write a return method that can find the unique characters from the String Ex: unique("AAABBBCCCDEF") ==> "DEF";
String -- Reverse
Write a return method that can reverse String Ex: Reverse("ABCD"); ==> DCBA
 */

