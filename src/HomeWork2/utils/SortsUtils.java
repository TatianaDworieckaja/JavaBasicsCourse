package HomeWork2.utils;

public class SortsUtils {

   /** bubble method of sorting */

    public static void bubble(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int x = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = x;
                }
            }
        }
    }

    /*shake method of sorting*/
    public static void shake(int[] arr) {
        int leftSide = 0;
        int rightSide = arr.length - 1;
        int count = 1;
        while (count > 0) {
            count = 0;
            for (int i = leftSide; i < rightSide; i++) {
                if (arr[i] > arr[i + 1]) {
                    int x = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = x;
                    count = 1;
                }
            }
            rightSide--;
            for (int i = rightSide; i > leftSide; i--) {
                if (arr[i] < arr[i - 1]) {
                    int x = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = x;
                    count = 1;
                }
            }
            leftSide++;
        }
    }
}

