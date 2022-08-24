package HomeWork5.methods;

import java.util.*;

public class Speed {

    /*measures speed when collection is iterated with iterator
    @param collection of type(class) T
     */
    public static <T> void speedWhenIterator (Collection<T> collection){
        Iterator<T> itr = collection.iterator();
        long start = System.currentTimeMillis();
        while(itr.hasNext()){
            itr.next();
        }
        long stop = System.currentTimeMillis();
        System.out.println("The collection was iterated with Iterator in  " + (stop - start) + " ms");
    }

    /* measures speed when collection is iterated with for i cycle
    @param collection of type(class) T
     */
    public static <T> void speedWhenForI(Collection<T> collection){
        long start = System.currentTimeMillis();
        List<T> list = new ArrayList<>(collection);
        for (int i = 0; i < collection.size();i++){
            T item = list.get(i);
        }
        long stop = System.currentTimeMillis();
        System.out.println("The collection was iterated with for i method in  " + (stop - start) + " ms");
    }

    /* measures speed when removing all elements: iterator
    @param collection of type (class) T
     */
    public static <T> void speedWhenRemoveItr(Collection<T> collection){
        Iterator<T> itr = collection.iterator();
    long start = System.currentTimeMillis();
       while(itr.hasNext()){
        T item = itr.next();
        itr.remove();
    }
    long stop = System.currentTimeMillis();
       System.out.println("All elements in collection were removed with iterator.remove() method in  " + (stop - start) + " ms");
    }

    /*measures speed when collection is removed by clear() method
    @param collection of type (class) T*/
    public static <T> void speedWhenClear(Collection<T> collection) {
        long start = System.currentTimeMillis();
        collection.clear();
        long stop = System.currentTimeMillis();
        System.out.println("All elements in collection were removed with collection.clear() method in  " + (stop - start) + " ms");
    }
}
