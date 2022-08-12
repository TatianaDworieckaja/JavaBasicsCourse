package HomeWork4;

import HomeWork4.Comparators.StringComparator;

import java.util.Arrays;

public class DataContainerMain {
    public static void main(String[] args) {
        DataContainer<String> container = new DataContainer<>(new String[4]);
        StringComparator comparator = new StringComparator();

        container.add("Hi");
        container.add("I");
        container.add("am");
        container.add("Tanya");


        //increase size of array
        container.add("And you?");

        System.out.println(Arrays.toString(container.getItems()));

        container.delete(1);
        System.out.println((container.get(4)));

        container.delete("Hi");
        System.out.println(Arrays.toString(container.getItems()));

        System.out.println(container.delete(null));

        container.add("What is your name?");
        container.add(null);

        container.sort(comparator);
        System.out.println(Arrays.toString(container.getItems()));

    }
}
