package HomeWork1;

import java.util.Scanner;

public class LetterOrSymbol {
    public static void main (String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Введи букву или символ, а я угадаю, что это: ");
        char a = console.next().charAt(0);

        if ((a >= 'A' && a <= 'Z') || (a >= 'a' && a <= 'z')) {
            System.out.print("Это буква: " + a);
        } else {
            System.out.print("Это не буква, а символ: " + a);
        }
    }
}
