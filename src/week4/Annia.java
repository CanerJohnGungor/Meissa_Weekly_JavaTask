package week4;

import java.util.Arrays;
import java.util.Scanner;

public class Annia {

    public static void main(String[] args) {
    /*
    1- Write a return method that can find the frequency of characters
    Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */
        Scanner in = new Scanner(System.in);
        System.out.println(countLetters(in.next()));
        System.out.println(uniqueChars(in.next()));

        System.out.println(same("abc", "cab")); // Output: true
        System.out.println(same("abc", "abb")); // Output: false
    }

    public static String countLetters(String str){

        String result = "";

        for(int i = 0; i < str.length(); i++){

            if(!result.contains(""+ str.charAt(i))){

            int count = 0;

                for(int j = 0; j < str.length(); j++){
                    if(str.charAt(i) == str.charAt(j)){
                        count++;
                    }
                }
                result += "" + count + str.charAt(i);
            }

        }

        return result;
    }
    /*
    The provided `countLetters` method takes a string as input and returns a new string that represents the count of each unique letter in the input string, followed by the letter itself. The method uses a nested loop to achieve this functionality.

    Here's the breakdown of the method:

        1. `String result = "";`: Initialize an empty string `result` to store the final count and letter representations.

        2. `for (int i = 0; i < str.length(); i++) {`: The outer loop iterates through each character of the input string.

        3. `if (!result.contains("" + str.charAt(i))) {`: Check if the `result` string does not already contain the current character. If the character is not present in the `result`, this means it's a unique character.

        4. `int count = 0;`: Initialize a variable `count` to store the count of the current character.

        5. The inner loop `for (int j = 0; j < str.length(); j++) {` iterates through the input string again to count the occurrences of the current character.

        6. `if (str.charAt(i) == str.charAt(j)) {`: Check if the current character in the outer loop matches the character in the inner loop. If they match, increment the `count`.

        7. `result += "" + count + str.charAt(i);`: After the inner loop finishes, append the `count` followed by the character to the `result`. This way, the `result` string contains the count and the letter for the unique characters.

        8. The outer loop continues to the next character, and the process is repeated.

        9. `return result;`: After the loops, the method returns the final `result` string containing the counts and letters for all the unique characters in the input string.
        */

    /*
       2- String --Remove Duplicates
        Write a return method that can remove the duplicated values form String
        Ex: removeDup("AAABBBCCC") ==> ABC
     */

    public static String uniqueChars(String str){

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (result.contains("" + str.charAt(i))){
                continue;
            }
            result += str.charAt(i);
        }
        return result;
    }
    /*
    The provided `uniqueChars` method takes a string as input and returns a new string that contains only the unique characters from the input string. It uses a simple loop to iterate through each character of the input string and appends it to the `result` string only if it's not already present in the `result` string. This ensures that only unique characters are added to the `result` string.

    Here's the breakdown of the method:

        1. `String result = "";`: Initialize an empty string `result` to store the unique characters.

        2. `for (int i = 0; i < str.length(); i++) {`: Loop through each character of the input string.

        3. `if (result.contains("" + str.charAt(i))) {`: Check if the `result` string already contains the current character. The `contains()` method is used to check for its existence.

        4. `continue;`: If the character is already in the `result` string, skip to the next iteration of the loop.

        5. `result += str.charAt(i);`: If the character is not already in the `result` string, append it to the `result`.

        6. `return result;`: After the loop, return the final `result` string containing only the unique characters.
        */

    /*
      3-  String --Same letters
        Write a return method that check if a string is build out of the same letters as another string
        Ex: same("abc", "cab"); -> true
            same("abc", "abb"); -> false

     */

        public static boolean same(String str1, String str2) {
            // Removing non-letter characters and convert to lowercase
            String cleanStr1 = str1.replaceAll("[^a-zA-Z]", "").toLowerCase();
            String cleanStr2 = str2.replaceAll("[^a-zA-Z]", "").toLowerCase();

            // Sorting the strings
            char[] sortedStr1 = cleanStr1.toCharArray();
            char[] sortedStr2 = cleanStr2.toCharArray();
            Arrays.sort(sortedStr1);
            Arrays.sort(sortedStr2);

            // Checking if the sorted strings are equal
            return Arrays.equals(sortedStr1, sortedStr2);
        }




    }




