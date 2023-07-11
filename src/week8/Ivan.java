package week8;

import java.util.Arrays;

public class Ivan {
    //Array - Move Zeros to the End
    //Write a method that can move all the zeros to last indexes of the array (Do Not Use Sort Method) Ex: input: {1,0,2,0,3,0,4,0}; output: [1, 2, 3, 4, 0, 0, 0, 0]
    public static int[] zerosAtBack(int [] arr){
        int[] zerosAtBack = new int[arr.length];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (arr[i] !=0){
                zerosAtBack[j] = arr[i];
                j++;
            }
        }

        return zerosAtBack;
    }
    //Array - N unique integers that sum up to 0
    //Write a function that given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0. The function can return any such array.
    //For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5]. The answer [1, - 1,1,3] would be incorrect (because value 1 occurs twice). For N = 3 one of the possible answers is [-1,0,1] (but there are many more correct answers).
    public static int[] uniqueEquals0(int n){
        int [] zeroSum = new int[n];

        for (int i = -100; i <=100 ; i++) {
            for (int j = 0; j < n ; j++) {



            }
        }

        return zeroSum;
    }




    public static void main(String[] args) {
        int[] arr = {10,0,2,0,5,0,8,0};
        System.out.println("zerosAtBack(arr) = " + Arrays.toString(zerosAtBack(arr)));


    }
}
/*
Array - N unique integers that sum up to 0
Write a function that given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0. The function can return any such array.
For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5]. The answer [1, - 1,1,3] would be incorrect (because value 1 occurs twice). For N = 3 one of the possible answers is [-1,0,1] (but there are many more correct answers).
Array - Move Zeros to the End
Write a method that can move all the zeros to last indexes of the array (Do Not Use Sort Method) Ex: input: {1,0,2,0,3,0,4,0}; output: [1, 2, 3, 4, 0, 0, 0, 0]
 */