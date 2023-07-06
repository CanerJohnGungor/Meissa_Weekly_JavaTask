package week7;

import java.util.Arrays;

public class Ihsan{

    public static void main(String[] args) {

        int[] array = {5, 2, 8, 1, 9, 3};
        int[] sortedArray = sortArrayAscending(array);
        System.out.println("Ascending order:");
        for (int num : sortedArray) {
            System.out.print(num + " ");
        }

        int[] numbers = {5, 2, 9, 1, 7,10,6};
        int[] sortedNumbers = sortArrayDescending(numbers);
        System.out.println("Descending order : ");
        System.out.println(Arrays.toString(sortedNumbers));

    }

    public static int[] sortArrayAscending(int[] array) {
        // Create a copy of the input array to avoid modifying the original array
        int[] sortedArray = Arrays.copyOf(array, array.length);

        // Perform a bubble sort
        boolean swapped;
        for (int i = 0; i < sortedArray.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < sortedArray.length - i - 1; j++) {
                if (sortedArray[j] > sortedArray[j + 1]) {
                    // Swap the elements if they are in the wrong order
                    int temp = sortedArray[j];
                    sortedArray[j] = sortedArray[j + 1];
                    sortedArray[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no swaps occurred in the inner loop, the array is already sorted
            if (!swapped) {
                break;
            }
        }

        return sortedArray;

    }

    public static int[] sortArrayDescending(int[] arr) {
        int n = arr.length;

        // Perform a simple bubble sort algorithm in descending order
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    // Swap the elements if the current element is less than the next element
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return arr;
    }

}