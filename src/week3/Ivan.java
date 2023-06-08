package week3;

public class Ivan {
    public static boolean isPrime(int num) {

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
            negative /= 10;

        }
        return reverse;
    }

    public static void main(String[] args) {

        System.out.println("isPrime " + isPrime(29));
        System.out.println(reverseNegative(-4523));

    }
}
