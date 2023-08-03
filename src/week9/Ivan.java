package week9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ivan {
    //1) Array - Concat two arrays
    //Write a return method that can concate two arrays

    public static int[] concat2Arrays(int[] arr1, int[] arr2) {
        int length = arr1.length + arr2.length;
        int[] arr3 = new int[length];

        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[arr1.length + i] = arr2[i];
        }

        return arr3;
    }

    //2) ArrayList - Remove "Ahmed"
    //Given a list of people' names: "Ahmed", "John", Eric", "Ahmed"..... Write a java operation to remove all the names named Ahmed

    public static ArrayList <String> removeString(ArrayList<String> arrayList, String remove){

        arrayList.removeIf(p -> p.equals(remove));

        return arrayList;
    }

    //3) ArrayList - Remove some values
    //Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
    public static ArrayList <Integer> removeIntGreater100(ArrayList<Integer> arrayList){

        arrayList.removeIf(p -> p > 100);

        return arrayList;
    }


    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 5, 6, 7, 8};
        int[] arr2 = {9, 10, 11, 12};

        System.out.println(Arrays.toString(concat2Arrays(arr1, arr2)));

        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed", "Ivan"));

        System.out.println(removeString(arrayList, "Ahmed"));

        ArrayList<Integer> arrayList1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,67,8,122,124,45345,12,43,123));

        System.out.println(removeIntGreater100(arrayList1));


    }
}


/*
1) Array - Concat two arrays
Write a return method that can concate two arrays
2) ArrayList - Remove "Ahmed"
Given a list of people' names: "Ahmed", "John", Eric", "Ahmed"..... Write a java operation to remove all the names named Ahmed
3) ArrayList - Remove some values
Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
 */