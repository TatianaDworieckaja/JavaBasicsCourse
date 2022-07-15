//4.1 Определить нечётное число
package HomeWork1;

import java.util.Scanner;

public class OddNumber {
    public static void main(String[] args) {
        Scanner console  = new Scanner(System.in);
        System.out.printf("Even or Odd? Please, print any number: ");
        int num = console.nextInt();
        if (num%2 != 0){
            System.out.printf("It is an odd number");
        }
        else {
            System.out.printf("It is an even number");
        }
    }
}
