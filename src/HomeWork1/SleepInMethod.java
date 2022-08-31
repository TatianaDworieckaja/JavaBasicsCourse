package HomeWork1;

public class SleepInMethod {
    public static String print(boolean weekday, boolean vacation) {
        if (weekday == false || vacation == true) {
            return "Можешь спать!";
        } else {
            return "Пора идти на работу";
        }
    }
}
