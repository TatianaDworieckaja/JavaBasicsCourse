package HomeWork5;

import HomeWork5.comparators.animal.*;
import HomeWork5.comparators.animal.AgePetNameComparator;
import HomeWork5.comparators.person.*;
import HomeWork5.dto.*;
import HomeWork5.methods.*;

import java.util.*;

//create and fill TreeSet with random data

public class TreeSetMain {
    public static void main(String[] args) {

        /*class Animal*/

        Set<Animal> animals= new TreeSet<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            animals.add(new Animal(RndData.getLatinName(), RndData.randomAge(15)));
        }
        long stop = System.currentTimeMillis();
        System.out.println("The ArrayList was filled with animals data in  " + (stop - start) + " ms");


        //call for method sorting list according to animals age
        Sorting.animalSort(animals, new AgeComparator());
        //call for method sorting list according to animals age and Name
        Sorting.animalSort(animals, new AgePetNameComparator());

        //speed measuring: iterator
        Speed.speedWhenIterator(animals);

        //speed measuring: for i
        Speed.speedWhenForI(animals);

        //speed measuring: removing by iterator
        Speed.speedWhenRemoveItr(animals);

        //speed measuring: removing by clear() method
        Speed.speedWhenClear(animals);



        /*Class Person*/

        //speed measuring: collection is being filled with data

        Set<Person> persons = new TreeSet<>();

        long start1 = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            persons.add(new Person(RndData.getAnyString(), RndData.getRealPerson(), RndData.randomPassword(5, 10)));
        }
        long stop1 = System.currentTimeMillis();
        System.out.println("The collection was filled with person objects data in  " + (stop1 - start1) + " ms");

        //call for method sorting list according to Age first and Name next
        Sorting.personSort(persons, new HomeWork5.comparators.person.AgeNameComparator());
        //call for method sorting list according to password length
        Sorting.personSort(persons, new PasswordComparator());


        //speed measuring: iterator
        Speed.speedWhenIterator(persons);

        //speed measuring: for i
        Speed.speedWhenForI(persons);

        //speed measuring: removing by iterator
        Speed.speedWhenRemoveItr(persons);

        //speed measuring: removing by clear() method
        Speed.speedWhenClear(persons);

    }
}

