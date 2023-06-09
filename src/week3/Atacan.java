package week3;

public class Atacan {
    public static void primeNumber(int n) {

        boolean isPrime = true;
        if (n <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= n / 2; i++) {
                if ((n % i) == 0) {

                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is not prime number");
        }
    }


    public static void reverseNegativeNumber(int number) {

        int reverse = 0;
        if (number >= 0) {
            System.out.println(number + " is not a negative number");
        } else {
            while (number != 0) {
                int digit = number % 10;
                reverse = reverse * 10 + digit;
                number /= 10;
            }
            System.out.println("Reverse number = " + reverse);
        }
    }

    public static void main(String[] args) {

        primeNumber(1);
        primeNumber(7);

        System.out.println("-----------------------");

        reverseNegativeNumber(1234);
        reverseNegativeNumber(-1234);

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