package week4;

import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Canan {

    public static void main(String[] args) {
        FrequencyOfCharacters("ADAaAAAAGRH");
        SameLetters("erre", "rere");
        RemoveDup("eewwFFGGg");

    }

    public static void FrequencyOfCharacters(String word) {

        String result = "";//EERRFF

        for (int i = 0; i < word.length(); i++) {
            int count = 0;

            if (result.contains("" + word.charAt(i))) {
                i++;
            } else {
                for (char each : word.toCharArray()) {
                    if (each == word.charAt(i)) {
                        count++;
                    }
                }
                result += word.charAt(i) + "" + count;
            }

        }
        System.out.println(result);
    }


    public static void SameLetters(String word1, String word2) {

        String[] arrWord1 = word1.split("");
        String[] arrWord2 = word2.split("");
        Arrays.sort(arrWord1);
        Arrays.sort(arrWord2);

        Boolean isSameLetters = Arrays.equals(arrWord1, arrWord2);
        System.out.println(isSameLetters);
    }

    public static void RemoveDup (String word){

        String result = "";

        for (int i = 0; i < word.length(); i++) {
            int count = 0;
            for (char each : word.toCharArray()) {
                if (!(each == word.charAt(i))) {
                    if (!(result.contains(each + ""))) {
                        result += "" + each;
                    }
                }
            }
        }
        System.out.println(result);
    }

}

/* THIS  METHOD ONLY WORKS IF WE TRY STRING WITH NON REPEATED LETTERS LIKE: "ERT-TRE"

    public static void SameLetters2(String word1, String word2) {
        Boolean sameLetters = false;//ert -trk
        int result = 0;
        if (word1.length() == word2.length()) {
            int count = 0;//e,r,t
            for (int i = 0; i < word1.length(); i++) {

                for (int j = 0; j < word2.length(); j++) {

                    if (word1.charAt(i) == word2.charAt(j)) {
                        count++;
                    }
                }
            }
            result = count;
            if (result == word1.length()) {
                sameLetters = true;
            }
        }

        System.out.println(sameLetters);
    }

*/