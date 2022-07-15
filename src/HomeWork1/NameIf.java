package HomeWork1;

import java.util.Objects;
import java.util.Scanner;

public class NameIf {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);

        System.out.printf("Как тебя зовут?");
        String firstName = console.next();


        if(Objects.equals(firstName,"Вася")) {
            System.out.println("Привет");
            System.out.println("Я тебя так долго ждал");
        }

        if (Objects.equals(firstName, "Анастасия")){
            System.out.println("Я тебя так долго ждал");
        }

        if (!(Objects.equals(firstName, "Вася") || Objects.equals(firstName, "Анастасия")) )
            System.out.println("Добрый день, а вы кто?");
        }
    }



