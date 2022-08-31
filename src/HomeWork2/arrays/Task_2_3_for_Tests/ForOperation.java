package HomeWork2.arrays.Task_2_3_for_Tests;

import java.util.Arrays;

public class ForOperation implements IArraysOperation {
    @Override
    public String printAll(int[] array) {
        int newArray[] = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        return Arrays.toString(newArray);
    }

    @Override
    public String printEverySecond(int[] array) {
        int newArray[] = new int[array.length / 2];
        int j = 0;
        for (int i = 1; i < array.length; i += 2) {
            newArray[j] = array[i];
            j++;
        }
        return Arrays.toString(newArray);
    }


    @Override
    public String printReverse(int[] array) {
        int newArray[] = new int[array.length];
        ;
        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            newArray[j] = array[i];
            j++;
        }
        return Arrays.toString(newArray);
    }
}
