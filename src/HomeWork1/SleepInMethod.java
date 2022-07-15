package HomeWork1;

import java.util.Scanner;

public class SleepInMethod {
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Сегодня будний день?");
        System.out.println("Если да, то напечатай 'y', если нет, то напечатай 'n'.");
        String day = console.next();
        System.out.println("Ты в отпуске? Если да, то напечатай 'y', если нет, то напечатай 'n'.");
        String vac = console.next();

        boolean weekday = day.equals("y");
        boolean vacation = vac.equals("y");

        if (sleepIn(weekday, vacation)) {
            System.out.println("Можешь спать!");
        } else {
            System.out.println("Пора идти на работу");
        }
    }
}
