package week1;

public class Atacan {

    public static String OddOrEven(int num) {

        if (num % 2 == 0) {
            return num + " is even number";
        } else {
            return num + " is odd number";
        }
    }

    public static int divideNumber(int n1, int n2) {

        int count = 0;

        if (n2 == 0) {
            System.err.println("n2 can not be 0");
            System.exit(1);
        }
        while (n1 >= n2) {
            n1 -= n2;
            count++;
        }
        return count;
    }

    public static void finRa() {

        String result = "";

        for (int i = 1; i < 31; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result += "FINRA ";
            } else if (i % 5 == 0) {
                result += "RA ";
            } else if (i % 3 == 0) {
                result += "FIN ";
            } else {
                result += i + " ";
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) {

        System.out.println(OddOrEven(7));

        System.out.println(divideNumber(10, 2));

        finRa();

    }
}
