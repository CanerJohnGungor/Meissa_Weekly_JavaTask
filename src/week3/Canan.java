package week3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Canan {

public static void primeNumber(int a){
 Boolean isPrime = true;
    for (int i = 2; i <a/2 ; i++) {  //we are looping from 2 to num/2. It is because a number
                                     // is not divisible by more than its half.
        if (a % i==0){
            isPrime =false;
            break;
        }
    }

if (isPrime == false){
        System.out.println(a+" is not a Prime Number.");
}else{
        System.out.println(a+" is a Prime Number.");
}

}

public static void reverseNegative (int num){

    int reverse =0;

     while (!(num == 0)){
        int digit = num % 10; // gets the last digit to add reverse number (since reverse, we start from the end)
        reverse= reverse*10 + digit; // adds the digit (we found above) to the reverse num
        num /=10; // removes last digit from original number to continue to get digits from the end

        }
     System.out.println(reverse);
 }
    public static void main(String[] args) {
        primeNumber(17);
        reverseNegative(-123456);
    }


}
