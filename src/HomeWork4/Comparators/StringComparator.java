package HomeWork4.Comparators;

import HomeWork4.DataContainer;

import java.util.Comparator;

public class StringComparator implements Comparator<String> {

/* return 1 if o1>o2;
return -1 if o2>o1;
return 0 if o1==o2*/

    @Override
    public int compare(String o1, String o2) {
        return o1.toLowerCase().compareTo(o2.toLowerCase());
    }
}

