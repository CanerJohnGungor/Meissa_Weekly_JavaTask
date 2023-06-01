package week1;

public class Teuta {

    public static String isOddOrEven(int number) {
        if (number % 2 == 0) {
            return number + " is even number";
        } else {
            return number + " is odd number";
        }
    }


    public static int divideNumber(int number, int number2) {
        int count = 0;

        if (number2 == 0) {
            System.err.println(number2 + " can not be 0");
            System.exit(1);
        }
        while (number >= number2) {
            number -= number2;
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

        System.out.println(isOddOrEven(25));

        System.out.println(divideNumber(10, 2));

        finRa();

    }
}










