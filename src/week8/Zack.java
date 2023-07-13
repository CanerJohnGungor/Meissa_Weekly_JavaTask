package week8;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class Zack {

    public static int[] chatGPTSagolsun(int N) {
        if (N <= 1 || N >= 100) {
            throw new IllegalArgumentException("N should be between 2 and 99.");
        }

        int[] array = new int[N];
        int sum = 0;
        for (int i = 0; i < N - 1; i++) {
            array[i] = i + 1;
            sum += array[i];
        }
        array[N - 1] = -sum;

        return array;
    }


    public static void moveZerosToEnd(int[] array) {
        int nonZeroIndex = 0;

        // Move non-zero elements to the beginning of the array
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                array[nonZeroIndex++] = array[i];
            }
        }

        // Fill the remaining elements with zeros
        while (nonZeroIndex < array.length) {
            array[nonZeroIndex++] = 0;
        }
    }


    public static void main(String[] args) {

        System.out.println(Arrays.toString(chatGPTSagolsun(4)));

        int [] mestOldum =  {1, 1, 1, 0, 0, 0, 0, 1, 3, 0, 5, 5, 0, 6, 6};

        moveZerosToEnd(mestOldum);

        System.out.println(Arrays.toString(mestOldum));


    }

}




