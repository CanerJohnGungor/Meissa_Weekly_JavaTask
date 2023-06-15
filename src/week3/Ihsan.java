package week3;

public class Ihsan {

    public static void  primeNumber(int num) {

        //A prime number is a number that is divisible by only two numbers: 1 and itself. So, if any number is divisible by any other number, it is not a prime number.


        boolean isPrime = false;
        for (int i = 2; i <= num / 2; ++i) {
            // condition for non-prime number
            if (num % i == 0) {
                isPrime = true;
                break;
            }
        }

        if (!isPrime)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }

    public static void reverseNegative (int num) {


        int reverse =0; // -9

        while (!(num == 0)){ //  -5689
            int digit = num % 10; // -9
            reverse= reverse*10 + digit; //(0*10+(-9) == -9
            num /=10; // -568

        }
        System.out.println(reverse);
    }
    public static void main(String[] args) {
        primeNumber(29);
        reverseNegative(268);
    }


}
/*

1. Numbers -- Prime Number
Write a method that can check if a number is
prime or not



2. Numbers -- Reverse negative number
Write a return method that can reverse
negative number and return it as int


 */