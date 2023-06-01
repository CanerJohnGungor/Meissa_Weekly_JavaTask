package week2;

public class Sreten {


 //   Numbers -- Swap Numbers
  //  Swap two variable' values without using a third variable

    public static void swap(int a, int b) {
        System.out.println(a + " | " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a + " | " + b);
    }

/*Numbers -- Divisible by 3, 5, 15
Write a program that can print the numbers between 1 ~ 100 that can be divisible
by 3, 5, and 15. if the number can be divisible by 3, 5 and 15, then it should only
 be displayed in DivisibelBy15' section if the number can be divisible by 3 but cannot
  be divisible by 15, then it should only be displayed in DivisibelBy3' section if the number can be divisible by 5 but cannot be divisible by 15, then it should only be displayed in DivisibelBy5' section.
*/



    public static void divisibleBy() {
        String divisibleBy15 = "Divisible by 15: ";
        String divisibleBy3 = "Divisible by 3: ";
        String divisibleBy5 = "Divisible by 5: ";
        for (int i = 1; i < 101; i++) {
            if (i % 15 == 0) {
                divisibleBy15 += i + " ";

            } else if (i % 3 == 0) {
                divisibleBy3 += i + " ";

            } else if (i % 5 == 0) {
                divisibleBy5 += i + " ";
            }

        }
        System.out.println(divisibleBy15);
        System.out.println(divisibleBy5);
        System.out.println(divisibleBy3);
    }


    /*Numbers -- print consecutive numbers
Write a function:
that, given a positive integer N, prints the consecutive numbers from 1 to N,
 each on a separate line. However, any number divisible by 2, 3 or 5 should be
 replaced by the word Codility, Test or Coders respectively. If a number is
  divisible by more than one of the numbers: 2,3 or 5, it should be replaced
   by a concatenation of the respective words Codility, Test and Coders in this
    given order. For example, numbers divisible by both 2 and 3 should be replacée
    by CodilityTest and numbers divisible by all three numbers: 2,3 and 5, should be
     replaced by CodilityTestCoders.
*/

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



