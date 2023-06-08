package week3;

public class Zack {

        public static boolean isPrime(int num) {

            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }

            return true;
        }

        public static int reverseNegative(int num) {
            int reverse = 0;

            while (num != 0) {

                int digit = num % 10;
                reverse = reverse * 10 + digit;
                num /= 10;

            }
            return reverse;
        }

        public static void main(String[] args) {

            System.out.println("isPrime " + isPrime(29));
            System.out.println(reverseNegative(-4523));

        }
    }

