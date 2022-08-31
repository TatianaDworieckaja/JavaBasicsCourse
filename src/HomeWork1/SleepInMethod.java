package HomeWork1;

public class SleepInMethod {
    public static String print(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return "Можешь спать!";
        } else {
            return "Пора идти на работу";
        }
    }
}
