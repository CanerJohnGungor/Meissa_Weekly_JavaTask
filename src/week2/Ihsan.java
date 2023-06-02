package week2;

public class Ihsan {

    public static void swap(int a, int b) {
        System.out.println(a + " | " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a + " | " + b);
    }

    public static void divisibleBy() {
        String divisibleBy15 = "Divisible by 15: ";
        String divisibleBy3 = "Divisible by 3: ";
        String divisibleBy5 = "Divisible by 5: ";
        String notDivisibleBy3_5_15= "Not Divisible 3_5_15: ";
        for (int i = 1; i < 101; i++) {
            if (i % 15 == 0) {
                divisibleBy15 += i + " ";

            } else if (i % 3 == 0) {
                divisibleBy3 += i + " ";

            } else if (i % 5 == 0) {
                divisibleBy5 += i + " ";
            }else{
                notDivisibleBy3_5_15 += i+" ";
            }

        }
        System.out.println(divisibleBy15);
        System.out.println(divisibleBy5);
        System.out.println(divisibleBy3);
        System.out.println(notDivisibleBy3_5_15);
    }

    public static void printNumbers(int a) {
        for (int i = 1; i <= a; i++) {
            String result = i + "";
            if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0) {
                result = "";
            }
            if (i % 2 == 0) {
                result += "Codility";
            }
            if (i % 3 == 0) {
                result += "Test";
            }

            if (i % 5 == 0) {
                result += "Coders";
            }
            System.out.println(result);
        }
    }

    public static void main(String[] args) {


        swap(12, 3);

        divisibleBy();

        printNumbers(24);


    }
}

