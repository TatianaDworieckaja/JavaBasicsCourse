package HomeWork2.arrays.Task_2_3_for_Tests;

import java.util.Arrays;

public class DoWhileOperation implements IArraysOperation{

    @Override
    public String printAll(int[] array) {
        int i = 0;
        int[] newArray = new int[array.length];
        do {
            newArray[i] = array[i];
            i++;
        }
        while (i<newArray.length);

        return Arrays.toString(newArray);
    }

    @Override
    public String printEverySecond(int[] array) {
        int i = 1;
        int j = 0;
        int[] newArray = new int[array.length/2];
        do {
            newArray[j] = array[i];
            i+=2;
            j++;
        }
        while (i<array.length);

        return Arrays.toString(newArray);

    }

    @Override
    public String printReverse(int[] array) {
        int[] newArray = new int[array.length];
        int i = array.length-1;
        int j = 0;
        do {
            newArray[j] = array[i];
            i--;
            j++;
        }while (i>=0);
        return Arrays.toString(newArray);
    }

}
