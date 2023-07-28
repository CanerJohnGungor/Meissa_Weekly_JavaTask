package week2;

public class Annia {

       public static void main(String[] args) {

           // Swap two variables' value without using a third variable.

           int a = 5;
           int b = 10;

           System.out.println("Before swapping: a = " + a + ", b = " + b);

           a = a + b;   // a = 15
           b = a - b;  // b = 15 - 10 = 5
           a = a - b;  // a = 15 - 5 = 10

           System.out.println("After swapping: a = " + a + ", b = " + b);


           /*In Java, Write a program that can print the numbers between 1 ~ 100 that can be divisible by 3, 5 and 15.
               If the number can be divisible by 3, 5 and 15 then it should only be displayed in DivisibleBy15' section.
               If the number can be divisible by 3 but cannot be divisible by 15, then it should only be displayed in DivisibleBy3' section.
               If the number can be divisible by 5 and cannot be divisible by 15 then it should only be displayed in DivisibleBy5' section.
           */

           String divisibleBy15 = "Divisible By 15:";
           String divisibleBy3 = "Divisible By 3:";
           String divisibleBy5 = "Divisible By 5:";

           for (int i = 1; i <= 100; i++) {
               if (i % 15 == 0) {
                   divisibleBy15 += " " + i;
               } else if (i % 3 == 0) {
                   divisibleBy3 += " " + i;
               } else if (i % 5 == 0) {
                   divisibleBy5 += " " + i;
               }
           }

           System.out.println(divisibleBy15);
               System.out.println(divisibleBy3);
           System.out.println(divisibleBy5);



           /*
           Write a function that, given a positive integer N,  each on a separate line. However, any number divisible by 2,3 or 5 should be replaced by the word Codility, Test or Coders respectively. If a number is divisible by more than on of the numbers:2,3 or 5, it should be replaced by a concatenation of the respective words Codility, Test and Coders in this given order. Fo example, numbers divisible by both 2 and 3 should be replaced by CodilityTest and numbers divisible by all three number: 2, 3 and 5, should be replaced byCilityTestCoders.

                for example, here is  an output for N =24
                1
                Codility
                Test
                Codility
                Coders
                CodilityTest

                7
                Codility
                Test
                CodilityCoders...
...
            */
                   int N = 24;
                   printNumbersWithReplacements(N);

               }

               public static void printNumbersWithReplacements(int N) {
                   for (int i = 1; i <= N; i++) {
                       String result = "";

                       if (i % 2 == 0) {
                           result += "Codility";
                       }
                       if (i % 3 == 0) {
                           result += "Test";
                       }
                       if (i % 5 == 0) {
                           result += "Coders";
                       }
                       System.out.println(result.isEmpty() ? i : result);
                   }
               }
           }






















