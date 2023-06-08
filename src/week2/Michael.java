package week2;

public class Michael {
    public static void main(String[] args) {
swapingNumbers(5,10);
divisibleBy();
codilityTestCoders(100);
int reverseNum =reverseNum(-56);
        System.out.println("reverseNum = " + reverseNum);

    }

    public  static void swapingNumbers(int a, int b){


        System.out.println("a="+a+" and b="+b+" before swap.");
        System.out.println("===========================================================================");
        a = a +b;
        b = a - b;
        a = a - b;

        System.out.println("a="+a+" and b="+b+" after swap.");

    }

    public static void divisibleBy() {
        String divisibleBy15 ="";
        String divisibleBy5 ="";
        String divisibleBy3="";
        int[] arr = new int[100];
        for(int i=0; i < arr.length; i++)
            arr[i] = i+1;

        for(int each: arr) {
            if(each %15==0 && each %3==0)
                divisibleBy15+= each+" ";
            if(each %5==0 && each % 15!=0)
                divisibleBy5 += each+" ";
            if(each%3==0 && each %15!=0)
                divisibleBy3 += each+" ";
        }
        System.out.println("Divisible By 15: "+divisibleBy15);
        System.out.println("Divisible By 5: "+divisibleBy5);
        System.out.println("Divisible By 3: "+divisibleBy3);
    }


    public static void codilityTestCoders(int N) {
        String result = "";
        for (int i = 1; i <= N; i++) {
            if(i %2 ==0 && i%3 == 0 && i %5==0)
                result += "CodilityTestCoders\n";
            else if(i %2 ==0 && i%3 == 0)
                result += "CodilityTest\n";
            else if(i % 2==0 && i %5==0)
                result += "CodilityCoders\n";
            else if(i % 3 == 0 && i % 5 ==0)
                result +="TestCoders\n";
            else if(i % 2 ==0)
                result += "Codility\n";
            else if (i % 5 == 0)
                result += "Coders\n";
            else if (i % 3 == 0)
                result += "Test\n";
            else
                result += i + "\n";
        }

        System.out.println(result);
    }

    public static int reverseNum(int  num) {
        String str = new StringBuilder(""+num).reverse().toString();
        if(num < 0) {
            str = "-"+str.substring(0, str.length()-1);
        }
        return Integer.valueOf(str);
    }

}
