package week2;

public class Atacan {

    public static void swap(int a, int b) {

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }


    public static void divisibleBy() {

        String divisibleBy15 = "";
        String divisibleBy3 = "";
        String divisibleBy5 = "";

        for (int i = 1; i < 101; i++) {
            if (i % 15 == 0) {
                divisibleBy15 += i + " ";

            } else if (i % 3 == 0) {
                divisibleBy3 += i + " ";

            } else if (i % 5 == 0) {
                divisibleBy5 += i + " ";
            }
        }

        System.out.println("Divisible By 15: " + divisibleBy15);
        System.out.println("Divisible By 3: " + divisibleBy3);
        System.out.println("Divisible By 5: " + divisibleBy5);

    }

    public static void ConsecutiveNumbers(int n) {

        for (int i = 1; i <= n; i++) {

            String result = "";

            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0) {
                result = i + "";

            } else {
                if (i % 2 == 0) {
                    result += "Codility";
                }
                if (i % 3 == 0) {
                    result += "Test";
                }
                if (i % 5 == 0) {
                    result += "Coders";
                }
            }
            System.out.println(result);
        }

    }

    public static void main(String[] args) {

        swap(6, 4);

        divisibleBy();

        ConsecutiveNumbers(30);

    }

}
