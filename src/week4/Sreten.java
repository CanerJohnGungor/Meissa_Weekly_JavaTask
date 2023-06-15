package week4;

import java.util.Arrays;

public class Sreten {
/*
String Same letters
Write a return method that check if a string is build
out of the same letters as another string.
Ex: same("abc", "cab"); -> true same("abc", "abb"); -> false:
*/
    public static boolean sameLetters(String str1, String str2){

        String[] strArr1 = str1.split("");
        String[] strArr2 = str2.split("");
        Arrays.sort(strArr1);
        Arrays.sort(strArr2);
        return Arrays.equals(strArr1, strArr2);
    }
//String -- Remove Duplicates
//Write a return method that can remove the duplicated values from
//String
//Ex: removeDup("AAABBBCCC") ==> ABC
    public static String removeDuplicates(String str){
        String result = "";

        for (String each : str.split("")) {
            if (!result.contains(each)){
                result += each;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(sameLetters("abc","bca"));
        System.out.println(removeDuplicates("BBBAAAACCCCHHH"));

    }
}

