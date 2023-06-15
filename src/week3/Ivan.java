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

    public static int reverseNegative1(int negative) {
        String reversed = "";

        if (negative < 0) {
            String num = String.valueOf(negative * -1);

            for (int i = num.length() - 1; i >= 0; i--) {
                reversed += num.charAt(i) + "";
            }
        } else {
            System.err.println("Only negative numbers");

        }
        return Integer.parseInt(reversed) * -1;

    }

    public static void main(String[] args) {

        System.out.println("isPrime " + isPrime(29));
        System.out.println(reverseNegative1(-9867));

    }
}
