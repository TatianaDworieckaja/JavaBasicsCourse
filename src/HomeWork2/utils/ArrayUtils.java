
package HomeWork2.utils;

import java.util.Random;
import java.util.Scanner;

/* This is a method which allows user to provide a size and array elements
* @return array */
public class ArrayUtils {

    public static int[] arrayFromConsole() {
        System.out.print("Provide array size: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];

        System.out.println("Provide " + size + " elements for your array:");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        return array;

    }

    /*method which @return array contained random values
    @param size  - defined size of array
    @param maxValueExclusion - top boundary of random numbers range */

    public static int[] arrayRandom(int size, int maxValueExclusion){
       int[] array = new int[size];
       Random r = new Random();

       for (int i = 0; i < array.length; i++){
           array[i] = r.nextInt(maxValueExclusion - 1);
       }
       return array;
    }
}
