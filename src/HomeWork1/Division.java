//Проверка делимости одного числа на другое
package HomeWork1;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("Введи два числа, кроме нуля");
        System.out.print("Число 1: ");
        int num1 = console.nextInt();

        System.out.print("Число 2: ");
        int num2 = console.nextInt();

        int result = num1%num2;
        boolean result1 = num1%num2 == 0;
        int result2 = num1/num2;

        if (result1) {
            System.out.println(num1 + " делится на " + num2 + " без остатка. Результат = " + result2);
        }
        else {
            System.out.println(num1 + " не делится на " + num2 + "без остатка");
            System.out.println("Остаток: " + result );
        }
    }
}
