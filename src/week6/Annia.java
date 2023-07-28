package week6;

public class Annia {

     /*
      1. Write a return method that can verify if a password is valid or not.
        requirements:
        1. Password MUST be at least have 6 characters and should not contain space
        2. PassWord should at least contain one upper case letter
        3. PassWord should at least contain one lowercase letter
        4. Password should at least contain one special characters
        5. Password should at least contain a digit.

        if all requirements above are met, the method returns true, otherwise returns false
     */


    public static boolean isValidPassword(String password) {

            if (password.length() < 6 || password.contains(" ")) {
                return false;
            }

            char[] charArray = password.toCharArray();

            boolean hasUpperCase = false;
            boolean hasLowerCase = false;
            boolean hasSpecialCharacter = false;
            boolean hasDigit = false;

            for (char ch : charArray) {
                if (Character.isUpperCase(ch)) {
                    hasUpperCase = true;
                }
                else if (Character.isLowerCase(ch)) {
                    hasLowerCase = true;
                }
                else if (!Character.isLetterOrDigit(ch)) {
                    hasSpecialCharacter = true;
                }
                else if (Character.isDigit(ch)) {
                    hasDigit = true;
                }
            }

            return hasUpperCase && hasLowerCase && hasSpecialCharacter && hasDigit;
        }


        /*
        2.Array -- Find Maximum
          Write a method that can find the maximum number from an int Array
         */
       public static int findMax(int[] arr) {
         if (arr == null || arr.length == 0) {
           throw new IllegalArgumentException("Array cannot be null or empty.");
         }

            int max = arr[0]; // Assuming the first element as the initial maximum

            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i]; // Updating the maximum if a larger element is found
                }
            }

            return max;
       }

       /*
       3. String -- sum of digits in a string
       Write a method that can return the sum of the digits in a string
        */

    public static int sumOfDigits(String str){

        int sum = 0;

        for (int i = 0; i < str.length() ; i++) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch)){
                sum += Character.getNumericValue(ch);
            }
        }
        return sum;
    }


    public static void main(String[] args) {

        String password1 = "Passw0rd$"; // Valid password
        String password2 = "Weak"; // Invalid password

        System.out.println("Password 1 is valid: " + isValidPassword(password1));
        System.out.println("Password 2 is valid: " + isValidPassword(password2));


        int[] numbers = {5, 10, 3, 7, 1, 9};
        int maxNumber = findMax(numbers);
        System.out.println("The maximum number is: " + maxNumber);

        String input = "Hello123World456";
        int digitSum = sumOfDigits(input);
        System.out.println("The sum of digits in the string is: " + digitSum);
    }
}


   /*
    public static boolean verifyIfPasswordIsValid(String password) {

        boolean isValid = true;

        if (password.length() < 6 || password.contains(" ")){
            isValid = false;
            System.out.println("Password should be at least 6 characters long and cannot have empty spaces");
        }
        if (password.isEmpty()){
            isValid = false;
            System.out.println("Please enter your password");
        }

            }
*/

