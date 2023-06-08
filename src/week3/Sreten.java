package week3;

public class Sreten {

    public static boolean prime(int num) {

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static int reverseNegative(int negative) {
        int reverse = 0;

        while (negative != 0) {

            int digit = negative % 10;
            reverse = reverse * 10 + digit;
            negative = negative/10;

        }
        return reverse *(-1);
    }

    public static void main(String[] args) {

        System.out.println("isPrime " + prime(27));
        System.out.println(reverseNegative(11223344));

    }
}
