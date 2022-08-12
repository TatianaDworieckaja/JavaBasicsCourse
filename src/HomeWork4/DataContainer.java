package HomeWork4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;


public class DataContainer<T> {
    private T[] data;

    public DataContainer(T[] data) { //constructor of objects which belong to class dataContainer
        this.data = data;
    }


    /*searching for first index in array with null value
    and @return such index
    if array's full then  @return is array length.*/
    public int searchForPlaceInArray() {

        for (int j = 0; j < data.length; j++) {
            if (data[j] == null) {
                return j;
            }
        }
        return data.length;
    }

    /*@param T item - the element to add to array
     * @return index of newly added element */
    public int add(T item) {
        if (item == null) {
            return -1;
        }
        int index = searchForPlaceInArray();
        if (index == data.length) {
            data = Arrays.copyOf(data, data.length + 1);
        }
        data[index] = item;
        return index;
    }


    /* @return object added previously with add method*/
    public T get(int index) {
        if (index >= data.length) {
            return null;
        }
        return data[index];
    }

    /* @return field data */
    public T[] getItems() {
        return data;
    }


    /* delete element according to index
    @return true if element is deleted
    @return false if there is no such index in array.
     */
    public boolean delete(int index) {
        T[] newData;
        if (index >= data.length) {
            return false;
        }
        newData = Arrays.copyOf(data, data.length - index - 1); //to copy elements before one to be deleted
        newData = Arrays.copyOf(newData, data.length - 1);
        for (int i = index; i < data.length - 1; i++) {
            newData[i] = data[i + 1];
        }
        data = newData;
        return true;

    }


    /*  Delete element according to its value
    @return false if the argument is null or there is no such element in the array
    @return true if element is removed.
    @param element to be deleted
   */
    public boolean delete(T item) {
        T[] newData;
        if (item == null) {
            return false;
        }

        for (int i = 0; i < data.length; i++) {
            if (data[i] == item) {
                delete(i);
                return true;
            }
        }
        return false;
    }

    /* sort elements in field data in descending order
     @param comparator - object of type Comparator*/
    public void sort(Comparator<T> comparator) {
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = i + 1; j < data.length; j++) {
                if (comparator.compare(data[i], data[j]) > 0) {
                    T tmp = data[j];
                    data[j] = data[i];
                    data[i] = tmp;
                }
            }
        }
    }

    /*@return array elements without those with null value*/

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        boolean comma = false;
        for (T element : data) {
            if (element != null) {
                if (comma) {
                    builder.append(" ");
                } else {
                    comma = true;
                }
                builder.append(element);
            }

        }
        return builder.toString();
    }
}













