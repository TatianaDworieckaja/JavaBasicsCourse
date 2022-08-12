package HomeWork4.Comparators;

import HomeWork4.DataContainer;

import java.util.Comparator;

public class IntComparator implements Comparator<Integer> {

    //Params: o1 – the first int to compare o2 – the second int to compare
    //Returns: the value 0 if x == y; a value less than 0 if x < y; and a value greater than 0 if x > y
    @Override
    public int compare(Integer o1, Integer o2) {
        return Integer.compare(o1, o2);
    }
}