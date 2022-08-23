package HomeWork5.dto;

public class Person implements Comparable<Person> {
    final private String nick;
    final private String password;
    final private String name;

    public Person (String nick,String name, String password){
        this.nick = nick;
        this.name = name;
        this.password = password;
    }

    public String getNick() {
        return nick;
    }

    public String getPassword() {
        return password;
    }


    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "nick='" + nick + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    // needed to create and fill collection TreeSet
    @Override
    public int compareTo(Person o) {
        return 0;
    }
}

