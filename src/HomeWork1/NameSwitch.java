package HomeWork1;

import java.util.Scanner;

public class NameSwitch {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);

        System.out.println("Как тебя зовут?");
        String firstName = console.next();

       switch (firstName){
        case "Вася":
        System.out.println("Привет");
        System.out.println("Я тебя так долго ждал");
        break;

        case "Анастасия":
        System.out.println("Я тебя так долго ждал");
        break;

        default:
        System.out.println("Добрый день, а вы кто?");
        }
    }
}

