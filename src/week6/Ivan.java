package week6;

public class Ivan {
    public static boolean passwordValidation(String password) {

        boolean isValidPsw = false;
        char[] charsArray = password.toCharArray();

        if (password.length() < 6 || password.contains(" ")) {
            return false;
        }
        for (char each : charsArray) {
            if (password.contains(Character.isUpperCase(each) + "")) {
                isValidPsw = true;
            }
            if (password.contains(Character.isLowerCase(each) + "")) {
                isValidPsw = true;
            }
            if (password.contains(Character.isDigit(each) + "")) {
                isValidPsw = true;
            }
            if (!password.contains(Character.isLetterOrDigit(each) + "")) {
                isValidPsw = true;
            }

        }

        return isValidPsw;
    }

    //Array -- Find Maximum
    //Write a method that can find the maximum number from an int Array
    public static int maxNumber(int[] arrayOfNums) {

        int maxNum = arrayOfNums[0];

        for (int eachNum : arrayOfNums) {
            if (eachNum > maxNum) {
                maxNum = eachNum;
            }
        }

        return maxNum;
    }

    //String -- sum of digits in a string
    //Write a method that can return the sum of the digits in a string
    public static int sumOfDigits(String str) {
        int sum = 0;
        for (String each : str.split("")) {
            sum += Integer.parseInt(each);
        }
        return sum;
    }

    public static void main(String[] args) {

        int[] nums = {14, 3, 4, 6, 12, 10, 15};
        System.out.println(maxNumber(nums));
        System.out.println(passwordValidation("12Jj!"));
        System.out.println(sumOfDigits("12319"));

    }
}
/*
String -- Password Validation Task
1. Write a return method that can verify if a password is valid or not. requirements:
1. Password MUST be at least have 6 characters and should not contain space
2. PassWord should at least contain one upper case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special characters
5. Password should at least contain a digit
if all requirements above are met, the method returns true, otherwise returns false


 */