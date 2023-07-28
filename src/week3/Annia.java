package week3;

public class Annia {

    /*
    1. Numbers -- Prime Number
    Write a method that can check if a number is
    prime or not
     */

        public static boolean isPrime(int number) {
            if (number <= 1) {
                return false; // Numbers less than or equal to 1 are not prime
            }

            if (number == 2) {
                return true; // 2 is a prime number
            }

            if (number % 2 == 0) {
                return false; // Even numbers (other than 2) are not prime
            }

            // Checking for divisibility from 3 up to the square root of the number
            for (int i = 3; i * i <= number; i += 2) {
                if (number % i == 0) {
                    return false; // If divisible, number is not prime
                }
            }

            return true; // If not divisible by any number, number is prime
        }

      /*  2. Numbers -- Reverse negative number
        Write a return method that can reverse
        negative number and return it as int
    */
          public static int reverseNegativeNumber(int number) {
              if (number >= 0) {
                  throw new IllegalArgumentException("Input must be a negative number.");
              }

              int reversedNumber = 0;

              while (number != 0) {
                  int lastDigit = number % 10;
                  reversedNumber = reversedNumber * 10 + lastDigit;
                  number /= 10;
              }

              return reversedNumber;
          }




    public static void main(String[] args) {
        int num1 = 17;
        int num2 = 20;

        System.out.println(num1 + " is prime: " + isPrime(num1)); // Output: 17 is prime: true
        System.out.println(num2 + " is prime: " + isPrime(num2)); // Output: 20 is prime: false

        int negativeNumber = -12345;
        int reversedNumber = reverseNegativeNumber(negativeNumber);
        System.out.println("Original Negative Number: " + negativeNumber);
        System.out.println("Reversed Negative Number: " + reversedNumber);
        }
    }


