package HomeWork5.comparators.person;

import HomeWork5.dto.Person;

import java.util.Comparator;

public class PasswordComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        int p1 = o1.getPassword().length();
        int p2 = o2.getPassword().length();
        return p1 - p2;
    }
}
