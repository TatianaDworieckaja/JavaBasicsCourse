package HomeWork1;

public class LetterOrSymbol {
    public static String letterOrSymbol(char a) {
        if ((a >= 'A' && a <= 'Z') || (a >= 'a' && a <= 'z')) {
            return "Это буква: " + a;
        } else {
            return "Это не буква, а символ: " + a;
        }
    }
}

