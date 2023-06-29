package week6;

public class Zack {

    public static boolean validPassword(String password){

        if(password.length() <6 || password.contains(" ")){
            return false;
        }
        // first assign negative value to boolean
        boolean hasUpperCase =  false;
            boolean hasLowerCase = false;
                boolean hasSpecialChar = false;
                     boolean hasDigit = false;
        for (char eachLetter : password.toCharArray()) {
            if(Character.isDigit(eachLetter)){
                hasDigit = true;
                } else if (Character.isUpperCase(eachLetter)) {
                    hasUpperCase = true;
                        } else if (Character.isLowerCase(eachLetter)) {
                            hasLowerCase = true;
                                }else{
                                     hasSpecialChar = true;
            }
        }
        return hasDigit && hasLowerCase && hasUpperCase && hasSpecialChar;
    }

    public static int arrayMaxNumber(int [] arr ){

        if(arr == null || arr.length ==0){
            throw new IllegalArgumentException("Array argument can not be empty or null");
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr [i] > max){
                max = arr [i];
            }
        }
        return max;
    }

    public static int calculateDigitSum(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isDigit(c)) {
                int digit = Integer.parseInt(String.valueOf(c));
                sum += digit;
            }
        }
        return sum;
    }


    public static void main(String[] args) {

        System.out.println(validPassword("Password1!"));
        System.out.println(arrayMaxNumber(new int[]{10, 20, 30, 40, 50}));
        System.out.println(calculateDigitSum("Holea123456jjasd"));
    }
}
