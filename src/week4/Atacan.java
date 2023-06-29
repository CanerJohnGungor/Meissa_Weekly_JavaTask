package week4;

import java.util.Arrays;

public class Atacan {

    public static void frequencyOfChars(String str) {

        str = str.toLowerCase();
        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {

                char each = str.charAt(j);
                if (ch == each) {
                    count++;
                }
            }

            if (result.contains("" + ch)) { // if the character is already included in the result
                continue; // skip that character
            }

            result += ch + "" + count;
        }

        System.out.println(result);

    }

    public static boolean sameLetters(String str1, String str2) {

        String[] strArr1 = str1.split("");
        String[] strArr2 = str2.split("");
        Arrays.sort(strArr1);
        Arrays.sort(strArr2);
        return Arrays.equals(strArr1, strArr2);
    }

    public static void removeDuplicates(String str) {
        str = str.toLowerCase();
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (result.contains("" + str.charAt(i))) {
                continue;
            }
            result += str.charAt(i);

        }

        System.out.println(result);
    }

    public static void main(String[] args) {
        frequencyOfChars("AaaBbC");
        removeDuplicates("AaaBbC");
    }
}
