package HomeWork5;

import HomeWork5.comparators.animal.*;
import HomeWork5.comparators.animal.AgePetNameComparator;
import HomeWork5.comparators.person.*;
import HomeWork5.dto.*;
import HomeWork5.methods.*;

import java.util.*;

public class ArrayListMain {
    public static void main(String[] args) {


        /*Class Animal*/

        //speed measuring: collection filling with data
        List<Animal> animals = new ArrayList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            animals.add(new Animal(RndData.getLatinName(), RndData.randomAge(15)));
        }
        long stop = System.currentTimeMillis();
        System.out.println("The ArrayList was filled with animals data in  " + (stop - start) + " ms");


        //call for methods sorting the list according to animals age
        animals.sort(new AgeComparator());
        //call for methods sorting the list according to animals age and name
        animals.sort(new AgePetNameComparator());


        //speed measuring: iterator
        Speed.speedWhenIterator(animals);

        //speed measuring: for i
        Speed.speedWhenForI(animals);

        //speed measuring: removing with iterator
        Speed.speedWhenRemoveItr(animals);

        //speed measuring: removing with clear() method
        Speed.speedWhenClear(animals);



        /*Class Person*/

        //speed measuring: collection is being filled with data

        List<Person> persons = new ArrayList<>();

        long start1 = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            persons.add(new Person(RndData.getAnyString(), RndData.getRealPerson(), RndData.randomPassword(5, 10)));
        }
        long stop1 = System.currentTimeMillis();
        System.out.println("The collection was filled with person objects data in  " + (stop1 - start1) + " ms");

        //call for method sorting list according to Age first and Name next
        persons.sort(new HomeWork5.comparators.person.AgeNameComparator());
        //call for method sorting list according to password length
        persons.sort(new PasswordComparator());


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

