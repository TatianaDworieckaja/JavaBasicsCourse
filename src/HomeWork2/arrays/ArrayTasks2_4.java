package HomeWork2.arrays;

import HomeWork2.utils.ArrayUtils;

import java.util.Arrays;

public class ArrayTasks2_4 {
    public static void main(String[] args) {
      // System.out.println("The sum of even and positive elements of an array is " + task2_4_1());
      // System.out.println();
      // System.out.println("The maximum value with even index is: " + task2_4_2());
       //System.out.println();
       //System.out.println("The elements of massive which are less than average are: " + task2_4_3());
       //System.out.println();
        //int[]container =  task2_4_5();
       // System.out.println("After: " + Arrays.toString(container));
        //System.out.println();
        System.out.println(task2_4_6());
    }

    /* This method summarizes even and positive elements of an array
     */
    public static int task2_4_1() {
        int[] array = ArrayUtils.arrayRandom(50, 100);
        int result = 0;
        for (int element : array) {
            if (element % 2 == 0 && element > 0) {
                result += element;
            }
        }
        return result;
    }

    /* This method finds the maximum value of element among those which indexes are even.
     */
    public static int task2_4_2() {
        int[] array = ArrayUtils.arrayRandom(50, 100);
        int max = array[2];
        int i = max + 2;

        while (i < array.length) {
            if (array[i] > max) {
                max = array[i];
            }
            i += 2;
        }
        return max;
    }


    /* This method finds the elements in array which values are less than average
     */
    public static String task2_4_3() {
        int[] array = ArrayUtils.arrayRandom(50, 100);
        String result = "";
        int sum = 0;
        int average = 0;

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }

        average = sum / array.length;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < average) {
                result = result + array[i] + " ";
            }
        }
        return result;
    }

    /* This method finds the two elements with min value in array
     */
    public static int[] task2_4_4() {
        int[] array = ArrayUtils.arrayRandom(50, 100);
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE - 1;
        ;
        for (int element : array) {
            if (element < min1) {
                min1 = element;
                min2 = min1;
            }
        }
        return new int[]{min1, min2};
    }

    //	This is a method which cleanses your array from element inside the defined range.

    public static int[] task2_4_5() {
        int[] array = ArrayUtils.arrayRandom(50, 100);
        System.out.println("Before cleansing: " + Arrays.toString(array));

        int border1 = 69;
        int border2 = 88;
        int N = array.length;
        int n = N;

        for (int i = 0; i < n; i++) {
            if (array[i] >= border1 && array[i] <= border2) {
                n--;
               for (int j=i; j<n; j++) {

                   array[j] = array[j + 1];
               }
            }
        }
        for (int i=n; i<N; i++){
                array[i] = 0;
            }
        return array;
        }

    //This method summarizes all digits inside the array

    public static int task2_4_6(){
        int[] array = ArrayUtils.arrayRandom(50, 100);
        System.out.println("Your array is: " + Arrays.toString(array));
        int sum = 0;

        for(int i=0; i<array.length; i++){
            int element = array[i];
            while (element >0) {
                sum = sum + element % 10;
                element = element / 10;
            }
        }
        return sum;
    }

    }


    





