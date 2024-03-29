package HomeWork5;

import HomeWork5.comparators.animal.*;
import HomeWork5.comparators.person.*;
import HomeWork5.dto.*;
import static HomeWork5.methods.Sorting.*;
import static HomeWork5.methods.Speed.*;
import static HomeWork5.methods.RndData.*;
import java.util.*;

public class LinkedListMain {
    public static void main(String[] args) {


        /*Class Animal*/

        //speed measuring: collection filling with data
        List<Animal> animals = new LinkedList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            animals.add(new Animal(getLatinName(), randomAge(15)));
        }
        long stop = System.currentTimeMillis();
        System.out.println("The ArrayList was filled with animals data in  " + (stop - start) + " ms");

        //call for method sorting list according to animals age/Age and Name
        animals.sort(new AgeComparator());
        animals.sort(new AgePetNameComparator());


        //speed measuring: iterator
        speedWhenIterator(animals);

        //speed measuring: for i
        speedWhenForI(animals);

        //speed measuring: removing when iterator used
        speedWhenRemoveItr(animals);

        //speed measuring: removing by clear() method
        speedWhenClear(animals);



        /*Class Person*/

        //speed measuring: collection is being filled with data

        List<Person> persons = new LinkedList<>();

        long start1 = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            persons.add(new Person(getAnyString(), getRealPerson(), randomPassword(5, 10)));
        }
        long stop1 = System.currentTimeMillis();
        System.out.println("The collection was filled with person objects data in  " + (stop1 - start1) + " ms");

        //call for method sorting list according to Age first and Name next
        sorting(persons, new AgeNameComparator());
        //call for method sorting list according to password length
        sorting(persons, new PasswordComparator());


        //speed measuring: iterator
        speedWhenIterator(persons);

        //speed measuring: for i
        speedWhenForI(persons);

        //speed measuring: removing when iterator used
        speedWhenRemoveItr(persons);

        //speed measuring: removing by clear() method
        speedWhenClear(persons);

    }
}

