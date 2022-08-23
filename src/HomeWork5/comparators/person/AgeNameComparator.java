package HomeWork5.comparators.person;


import HomeWork5.dto.Person;

import java.util.Comparator;

public class AgeNameComparator implements Comparator<Person> {
    public int compare(Person o1, Person o2) {
        int p1 = o1.getPassword().length();
        int p2 = o2.getPassword().length();
        int dif = p1 - p2;
        if ( dif != 0) {   // if age is different
            return dif;
        }
        return o1.getNick().compareTo(o2.getNick());
    }

}
