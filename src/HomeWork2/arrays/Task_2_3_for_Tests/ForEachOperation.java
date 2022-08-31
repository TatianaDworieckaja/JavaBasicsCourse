package HomeWork2.arrays.Task_2_3_for_Tests;

public class ForEachOperation implements IArraysOperation{
    @Override
    public String printAll(int[] array) {
        StringBuilder str = new StringBuilder();
        for (int element:array){
            str.append(element).append(" ");
        }
        str.setLength(str.length()-1);
        return str.toString();
    }

    @Override
    public String printEverySecond(int[] array) {
    StringBuilder str = new StringBuilder();
    int count = 1;
        for (int element:array){
            if (count%2 == 0){
                str.append(element).append(" ");
            }
            count++;
        }
        str.setLength(str.length()-1);
        return str.toString();
    }

    @Override
    public String printReverse(int[] array) {
        StringBuilder str = new StringBuilder();
        int i  = array.length-1;
        for (int element:array){
            str.append(array[i]).append(" ");
            i--;
        }
        str.setLength(str.length() - 1);
        return str.toString();
    }
}
