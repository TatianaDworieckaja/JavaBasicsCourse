//Перевести байты в килобайты или наоборот
package HomeWork1;

import java.util.Scanner;

public class ByteToKilobyte {
    public static void main (String[] args){

        Scanner console = new Scanner(System.in);


        System.out.print("Хочешь перевести килобайты в  байты (b) или наоборот (kb)? Ответ (b или kb): ");
        String answer  = console.next();

        System.out.println("Введи значение");
        int number = console.nextInt();

        switch (answer){
            case "b":
                System.out.println("Результат: " + (float)number*1000 + " байт.");
                break;
            case "kb":
                System.out.printf("Результат: " + (float)number/1000 + " килобайт.");

        }

    }
}
