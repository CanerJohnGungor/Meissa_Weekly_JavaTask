package week7;

import java.util.Arrays;

public class Ivan {
    public static int minNum(int[] arr) {
        int minNum = arr[0];
        for (int each : arr) {
            if (each < minNum) {
                minNum = each;
            }
        }
        return minNum;

    }

    public static int[] ascendingOrder(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }

        }
        return arr;
    }

    public static int[] descendingOrder(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }

        }
        return arr;
    }


    public static void main(String[] args) {

        int[] arr = {10, 3, 5, 7, -3, -10};
        System.out.println(minNum(arr));
        System.out.println("ascendingOrder(arr) = " + Arrays.toString(ascendingOrder(arr)));
        System.out.println("Arrays.toString(descendingOrder(arr)) = " + Arrays.toString(descendingOrder(arr)));
    }
}
/*
Question1: Array - Find Minimum
Write a method that can find the maximum number from an int Array
Question2: Array - Sort Ascending
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class Ex: int[] arr = {10, 9, 8, 7};
arr = Sort(arr); ==>{ 7, 8, 9, 10};
Question3: Array - Sort Descending
Write a return method that can sort an int array in descending order without using the sort method of the Arrays class Ex: int[] arr = {10,20,7, 8, 90};
arr = Sort(arr); ==> {90, 20, 10, 8, 7};
 */