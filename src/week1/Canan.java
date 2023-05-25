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

        int num = 30;
        printnumbers(num);

    }


    // METHODS:

    //TASK 1

    public static void EvenOrOdd(int number) {

        String EvenOrOdd= (number %2 ==0)?"Even":"Odd";

        System.out.println("The number "+number+" is "+EvenOrOdd);
    }

    //TASK 2

    public static void divide(int dividend, int divisor) {  int quotient=0;

        try{

            if (divisor == 0) {
                System.err.println("Divisor cannot be zero. Please enter a valid divisor!");
            }else{
                while(divisor<=dividend) {
                    dividend = dividend - divisor;
                    quotient++;
                }
            }
            System.out.println("Quotient is: " + quotient+ "\nRemainder is: "+dividend % divisor);

        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception has occurred ");
        }

    }

    //TASK 3

    public static void printnumbers(int num) {

        String result= " ";

        for (int i = 1; i <=num; i++) {

            if (i % 15 == 0) {
                result +=" FINRA ";
            } else if (i % 5==0) {
                result +=" RA ";
            } else if (i % 3 ==0) {
                result += " FIN";
            }else{
                result += " "+i+" ";
            }
        }

        System.out.println(result); //STRING RESULT
    }
}
   /* TASK 3 with Array:

    public static void main(String[] args) {

        int []nums = new int[31];
        printnumbers(nums);
    }

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
    } */