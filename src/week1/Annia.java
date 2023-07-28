package week1;

public class Annia {


    public static void main(String[] args) {

        System.out.println(oddOrEven(8));
        System.out.println(divide(12, 4));
        printoutNumbersAndLetters();
    }

    /*
        Write a method which can identify given number is even or odd
        Ex:
            identify(5)-> "Odd"
            identify(6)-> "Even"
*/

    public static String oddOrEven(int num) {

        if (num % 2 == 0) {
            return num + " num is even";
        } else {
            return num + "is odd";
        }

    }

    /*
        Write a method that can divide two numbers without using division operator
     */

    public static int divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        int quotient = 0;

        while (dividend >= divisor) {
            dividend -= divisor;
            quotient++;
        }
        return quotient;
    }

    /*
        FINRA :
        Write a method which prints out the numbers from 1 to 30 but for numbers which
        are a multiple of 3 print "FIN" instead of the number and for numbers which are a
        multiple of 5, print "RA" instead of the number. for numbers which are a multiple of
        both 3 and 5, print "FINRA" instead of the number
     */

    public static void printoutNumbersAndLetters() {
        String str = "";
        for (int i = 1; i < 31; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                str += "FINRA";
            } else if (i % 5 == 0) {
                str += "RA";
            } else if (i % 3 == 0){
                str += "FIN";
            } else {
                str += i + " ";
            }
        }
        System.out.println(str);
    }

}


