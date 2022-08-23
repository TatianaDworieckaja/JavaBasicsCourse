package HomeWork5.comparators.animal;


import HomeWork5.dto.Animal;

import java.util.Comparator;

public class AgePetNameComparator implements Comparator<Animal> {
    public int compare(Animal o1, Animal o2) {
        int comp = Integer.compare(o1.getAge(), o2.getAge());
        if (comp != 0) {// if age is different
            return comp;
        }
        return o1.getName().compareTo(o2.getName());
    }

}
