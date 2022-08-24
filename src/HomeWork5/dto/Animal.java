package HomeWork5.dto;


public class Animal {
    final private int age;
    final private String name;

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


}
