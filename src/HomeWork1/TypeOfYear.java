//4.6 Определить високосный год или нет
package HomeWork1;

import java.util.Scanner;

public class TypeOfYear {
    public static void main (String[] args){

        Scanner console = new Scanner(System.in);

        System.out.print("Введи год:");
        int year = console.nextInt();
        boolean result = year%4 == 0;

        if (result){
            System.out.print("Этот год - високосный");
        }
        else {
            System.out.print("Этот год - невисокосный");
        }

    }
}
