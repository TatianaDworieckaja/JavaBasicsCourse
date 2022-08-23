package HomeWork5.dto;

import java.util.Objects;

public class Animal implements Comparable {
    private int age;// 1-15
    private String name; //pet name

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }



    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    // needed to create and fill collection TreeSet
    @Override
    public int compareTo(Object o) { ////implementation is needed to create and fill collection TreeSet
        return 0;
    }
}
