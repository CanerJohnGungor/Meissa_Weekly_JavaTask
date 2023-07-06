package week7;

import java.util.Arrays;

public class Sreten {

    //Question1: Array - Find Minimum
    //Write a method that can find the maximum number from an int Array

public static int minNum(int[] arr){


    int min = arr[0];//initial value starts from first element
    for (int each : arr){
        if(each< min){
            min = each;
        }
    }
    return min;
}


    //Question2: Array - Sort Ascending
    //Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
    //Ex: int[] arr = {10, 9, 8, 7};
    // arr = Sort(arr); ==>{ 7, 8, 9, 10};

    public static int[] sortAscending(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {//all comparing done in inner loop j
                // - 1 because we compare one next to each
                //when number next to it is bigger - swap position

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];  //here we keep bigger number
                    arr[j] = arr[j + 1];//assign smaller to other position
                    arr[j + 1] = temp; //here we put the bigger number back
                }


            }
        }
        return arr;
    }
    //Question3: Array - Sort Descending
    //Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
    //Ex: int[] arr = {10,20,7, 8, 90};
    // arr = Sort(arr); ==> {90, 20, 10, 8, 7};

    public static int[] sortDescending(int[] arr) {//don't know what this is :)

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {//all comparing done in inner loop j
                // - 1 because we compare one next to each
                //when number next to it is bigger - swap position

                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];  //here we keep bigger number
                    arr[j] = arr[j + 1];//assign smaller to other position
                    arr[j + 1] = temp; //here we put the bigger number back
                }


            }
        }
        return arr;
    }


    public static void main(String[] args) {
    int[]arr1 = {3,6,7,15,50,80};
         System.out.println(minNum(arr1));
         System.out.println(Arrays.toString(sortAscending(arr1)));
         System.out.println(Arrays.toString(sortDescending(arr1)));

    }
}

