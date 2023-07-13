package week7;

public class Zack {

    /**
     Write a method that can find the maximum number from an int Array
     */
    public static int arrayMinNumber(int [] arr ){

        if(arr == null || arr.length ==0){
            throw new IllegalArgumentException("Array argument can not be empty or null");
        }
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr [i] < min){
                min = arr [i];
            }
        }
        return min;
    }

    /**
     Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
     */
    public static int arrayAscending(){

        int a = 0;

        return a;
    }




    public static void main(String[] args) {

        System.out.println(arrayMinNumber(new int[]{2, 3, 4, 5, 1}));
    }
}
