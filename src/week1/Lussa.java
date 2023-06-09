package week1;

public class Lussa {
    public static void main(String[] args) {
        System.out.println("Hello Friends");
        System.out.println("Have a happy week");
        System.out.println("New test");

    }

    public class OddOrEven {

        //public static void main(String[] args) {

        int number = 100;

        boolean isEven = number % 2 == 0;  // When we a number by 2, if the remainder is zero, it means the number is even

        // boolean isOdd = number % 2 != 0; // When we a number by 2, if the remainder is NOT zero, it means the number is odd

        boolean isOdd = !isEven; // if the number is not even, then it's odd

        //  System.out.println(number + " is an even number: " +  isEven );
        // System.out.println(number + " is an odd number: " + isOdd );

    }
}

