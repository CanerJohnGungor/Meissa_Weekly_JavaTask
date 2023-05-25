package week1;

import java.util.Scanner;

public class Canan {

    public static void main(String[] args) {

        //TASK 1
        Scanner input= new Scanner (System.in);

        System.out.println("Please enter a number");

        int number = input.nextInt();

        EvenOrOdd (number);

        //TASK 2

        Scanner input2 = new Scanner (System.in);

        System.out.println("Please enter the dividend");

        int dividend= input2.nextInt();

        System.out.println("Please enter the divisor");

        int divisor= input2.nextInt();

        divide(dividend,divisor);

        //TASK 3

        int []nums = new int[31];
        printnumbers(nums);

    }

    // METHODS:

    //TASK 1

    public static void EvenOrOdd(int number) {

        String EvenOrOdd= (number %2 ==0)?"Even":"Odd";

        System.out.println("The number "+number+" is "+EvenOrOdd);
    }

    //TASK 2

    public static void divide(int dividend, int divisor) {  int quotient=0;

        while(divisor<=dividend) {
            dividend = dividend - divisor;
            quotient++;
        }

        System.out.println("Quotient is: " + quotient+ "\nRemainder is: "+dividend % divisor);

    }

    //TASK 3

    private static void printnumbers(int[] nums) {

        for (int i = 1; i <=30; i++) {
            nums[i]=i;

            if (nums[i] % 3 == 0) {
                System.out.println("FIN");
            } else if (nums[i] %5==0) {
                System.out.println("RA");
            } else if (nums[i]%15 ==0) {
                System.out.println("FINRA");
            }else{
                System.out.println(nums[i]);
            }
        }
    }
}