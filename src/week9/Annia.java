package week9;

public class Annia {

        public static void main(String[] args) {

            int[] arr1 = {1, 2, 3};
            int[] arr2 = {4, 5, 6};
            int[] result = concatenateArrays(arr1, arr2);

            // Print the concatenated array
            for (int num : result) {
                System.out.print(num + " ");
            }
        }

  /*
    1) Array - Concat two arrays
       Write a return method that can concat two arrays
  */
    public static int[] concatenateArrays(int[] arr1, int[] arr2) {
            int len1 = arr1.length;
            int len2 = arr2.length;
            int[] result = new int[len1 + len2];

            for (int i = 0; i < len1; i++) {
                result[i] = arr1[i];
            }

            for (int i = 0; i < len2; i++) {
                result[len1 + i] = arr2[i];
            }

            return result;
        }
    }



