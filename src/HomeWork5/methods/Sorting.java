package HomeWork5.methods;


import java.util.*;

public class Sorting {

    /*method of sorting for all collections
    @param collection of type (class) T
    @param comparator
     */
    public static <T> void sorting(Collection<T> collection, Comparator<T> cmp) {
        ArrayList<T> arrayList = new ArrayList<>(collection);
        arrayList.sort(cmp);
    }


}
