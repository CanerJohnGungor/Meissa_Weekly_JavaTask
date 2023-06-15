package week3;

public class Michael {
    public static void main(String[] args) {

        reverseNum(-5612);
        primeNumber(5);
        primeNumber(6);

    }
    public static boolean primeNumber(int num) {

        if(num <= 1){
            return false;
        }

        for(int i = 2; i < num; i++) {
            if(num % i == 0) {
                System.out.println(num+" is not a prime number.");
                return false;
            }
        }
        System.out.println(num+" is a prime number");
        return true;

    }


    public static int reverseNum(int  num) {
        String str = new StringBuilder("" + num).reverse().toString();
        if (num < 0) {
            str = "-" + str.substring(0, str.length() - 1);
        }

        int result = Integer.valueOf(str);
        System.out.println(result);
        return result;
    }
}
