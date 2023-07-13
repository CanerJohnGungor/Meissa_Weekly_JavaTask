package week4;

import java.awt.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Zack {

    public static String frequencyOfChar(String str) {
         String result = "";
    for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);
        int count = 0;
            for (int j = 0; j < str.length(); j++) {
                char each = str.charAt(j);
                    if(ch==each){
                         count++;
                    }
                }
                            if(result.contains(""+ch)){
                                continue;
            }
                                    result +=ch+""+count+" ";

        }
        return result;
    }

   public static boolean sameLetter(String string1, String string2) {
        // Convert both strings to lowercase and remove any whitespace
        string1 = string1.toLowerCase().replaceAll("\\s+", "");
        string2 = string2.toLowerCase().replaceAll("\\s+", "");

        // Sort the characters in both strings
         char[] sortedString1 = string1.toCharArray();
        char[] sortedString2 = string2.toCharArray();
            Arrays.sort(sortedString1);
            Arrays.sort(sortedString2);



        // Check if the sorted strings are equal
        return Arrays.equals(sortedString1, sortedString2);
    }

   public static String removeDuplicates(String str){
   String result ="";

   for (int i = 0; i < str.length(); i++) {

       if(result.contains(""+str.charAt(i))){
               continue;
           }
           result +=str.charAt(i);
       }
        
        return result;
   }


    public static void main(String[] args) {

        System.out.println(frequencyOfChar("Sevemedim Kara Gozlum"));
        System.out.println(sameLetter("abcde", "edcba"));
        System.out.println(removeDuplicates("Regression"));

    }

}