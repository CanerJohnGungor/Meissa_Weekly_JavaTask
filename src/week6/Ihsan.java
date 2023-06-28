package week6;

public class Ihsan {

    public static void main(String[] args) {


        //Array -- Find Maximum
        //Write a method that can find the maximum number from an int Array

        int[] numbers = {100, 20, 888, 40, -10, 30};

        int max = numbers[0]; // assume that first element is the maximum number

        for (int i = 1; i < numbers.length; i++) { // i: 1, 2, 3, 4...

            if (numbers[i] > max) { // compares the element of the array with current maximum number
                max = numbers[i]; // replace the current maximum number
            }

        }





        //String -- sum of digits in a string
        //Write a method that can return the sum of the digits in a string

        String s = "2PREP6l3SGFVH9"; //Take a string input from user and store it in the variable called “s”
        int sum = 0;
        for (int i = 0; i < s.length(); i++) { //Take a i for loop start from i=0 to i<s.length()
            if (Character.isDigit(s.charAt(i))) //Check the condition that character is digit or not.

                sum = sum + Character.getNumericValue(s.charAt(i)); //Calculate sum of each digit and store it in the sum variable.

        }


        System.out.println("max = " + max);

        System.out.println("---------------------------------------------------------");

        System.out.println("Sum of all the digit present in String : " + sum);

        System.out.println("---------------------------------------------------------");

        System.out.println(isValidPassword("ssA1gfgf.@gf"));


    }


    //String -- Password Validation Task
    // 1. Write a return method that can verify if a password is valid or not. requirements:
    // 1. Password MUST be at least have 6 characters and should not contain space
    // 2. PassWord should at least contain one upper case letter
    // 3. PassWord should at least contain one lowercase letter
    // 4. Password should at least contain one special characters
    // 5. Password should at least contain a digit if all requirements above are met, the method returns true,
    // otherwise returns false


    public static boolean isValidPassword(String password){

        boolean isValid = true;
        if (!(password.length() >=6))
        {
            System.out.println("Password must be at least 6 characters in length.");
            isValid = false;
        }
        String upperCaseChars = "(.*[A-Z].*)";
        if (!password.matches(upperCaseChars ))
        {
            System.out.println("Password must have at least one uppercase character");
            isValid = false;
        }
        String lowerCaseChars = "(.*[a-z].*)";
        if (!password.matches(lowerCaseChars ))
        {
            System.out.println("Password must have at least one lowercase character");
            isValid = false;
        }
        String numbers = "(.*[0-9].*)";
        if (!password.matches(numbers ))
        {
            System.out.println("Password must have at least one number");
            isValid = false;
        }
        String specialChars = "(.*[@,#,$,%,.].*$)";
        if (!password.matches(specialChars ))
        {
            System.out.println("Password must have at least one special character among .@#$%");
            isValid = false;
        }

        if (password.contains(" ")){
            System.out.println("Password can not contain space");
            isValid = false;
        }
        return isValid;
    }

}
//...