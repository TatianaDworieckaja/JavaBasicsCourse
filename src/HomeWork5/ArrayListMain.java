package HomeWork5;

import HomeWork5.comparators.animal.*;
import HomeWork5.comparators.person.*;
import HomeWork5.dto.*;
import static HomeWork5.methods.Sorting.*;
import static HomeWork5.methods.Speed.*;
import static HomeWork5.methods.RndData.*;
import java.util.*;


public class ArrayListMain {
    public static void main(String[] args) {


        /*Class Animal*/

        //speed measuring: collection filling with data
        List<Animal> animals = new ArrayList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            animals.add(new Animal(getLatinName(), randomAge(15)));
        }
        long stop = System.currentTimeMillis();
        System.out.println("The collection animals was filled with animals data in  " + (stop - start) + " ms");


        //call for methods sorting the list according to animals age
        sorting(animals, new AgeComparator());
        //call for methods sorting the list according to animals age and name
        sorting(animals, new AgeComparator());


        //speed measuring: iterator
        speedWhenIterator(animals);

        //speed measuring: for i
        speedWhenForI(animals);

        //speed measuring: removing when iterator is used
        speedWhenRemoveItr(animals);

        //speed measuring: removing with clear() method
        speedWhenClear(animals);



        /*Class Person*/

        //speed measuring: collection is being filled with data

        List<Person> persons = new ArrayList<>();

        long start1 = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            persons.add(new Person(getAnyString(), getRealPerson(), randomPassword(5, 10)));
        }
        long stop1 = System.currentTimeMillis();
        System.out.println("The collection persons was filled with person objects data in  " + (stop1 - start1) + " ms");

        //call for method sorting list according to Age first and Name next
        sorting(persons, new AgeNameComparator());
        //call for method sorting list according to password length
        sorting(persons, new PasswordComparator());


        //speed measuring: iterator
        speedWhenIterator(persons);

        //speed measuring: for i
        speedWhenForI(persons);

        //speed measuring: removing when iterator is used
        speedWhenRemoveItr(persons);

        //speed measuring: removing by clear() method
        speedWhenClear(persons);

    }
}

