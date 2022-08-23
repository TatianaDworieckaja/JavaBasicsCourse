package HomeWork5.methods;

import HomeWork5.dto.Animal;
import HomeWork5.dto.Person;

import java.util.*;

public class Sorting {

    /* sorting method for collection HashSet for class Animal
    * @param collection of type(class) Animal
    * @param comparator */

    public static void animalSort(Set<Animal> collection, Comparator <Animal> comparator){
        List<Animal> list= new ArrayList<>(collection);
        list.sort(comparator);
        HashSet<Animal> finalSet = new HashSet<>(list);
        System.out.println("After sorting " + finalSet);
    }

    /* sorting method for collection HashSet for class Person
     * @param collection of type(class) Animal
     * @param comparator */

    public static void personSort(Set<Person> collection, Comparator <Person> comparator){
        List<Person> list= new ArrayList<>(collection);
        list.sort(comparator);
        HashSet<Person> finalSet = new HashSet<>(list);
        System.out.println("After sorting " + finalSet);
    }


}
