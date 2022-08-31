package HomeWork2.arrays.Task_2_3_for_Tests;

import java.util.Arrays;

public class WhileOperation implements IArraysOperation{
    @Override
    public String printAll(int[] array) {
        int i = 0;
        int[] newArray = new int[array.length];
        while (i<array.length){
            newArray[i] = array[i];
            i++;
        }
        return Arrays.toString(newArray);
    }

    @Override
    public String  printEverySecond(int[] array) {
        int i = 1;
        int j = 0;
        int[] newArray = new int[array.length/2];
        while (i<array.length){
            newArray[j] = array[i];
            i+=2;
            j++;
        }
        return Arrays.toString(newArray);
    }

    @Override
    public String printReverse(int[] array) {
        int i = array.length-1;
        int j = 0;
        int[] newArray = new int[array.length];
        while ( i >= 0){
            newArray[j] = array[i];
            i--;
            j++;
        }
        return Arrays.toString(newArray);
    }
}
