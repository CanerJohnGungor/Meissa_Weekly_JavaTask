package week4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ivan {

    public static String frequancyOfChars(String str){

        String [] strArr = str.split("");
        String result = "";

        for (String each : strArr) {

            int count = 0;
            for (String eachCh : strArr) {
                if (each.equals(eachCh)){
                    count++;
                }
            }
            if (result.contains(each)){
                continue;
            }

            result += each + "" + count;
        }
        return result;

    }

    public static boolean sameLetters(String str1, String str2){

       String[] strArr1 = str1.split("");
       String[] strArr2 = str2.split("");
       Arrays.sort(strArr1);
       Arrays.sort(strArr2);
        return Arrays.equals(strArr1, strArr2);
    }

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

        System.out.println("frequancyOfChars(\"AAABBBCD\") = " + frequancyOfChars("AAABBBCD"));
        System.out.println(sameLetters("avc","cav"));
        System.out.println(removeDuplicates("AAAABBBBCCCDDDDSSS"));

    }
}
