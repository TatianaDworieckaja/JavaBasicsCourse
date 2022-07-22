package HomeWork2.loops;

import java.util.Scanner;
////Эта программа перемноживает  числа от 1 до числа (включительно) введенного через аргумент к исполняемой программе c помощью рекурсии.
public class Recursion_1_1_2 {
        public static void main(String[] args) {

           Factorial fObject = new Factorial();

            System.out.println("Provide any positive number here:");
            Scanner console = new Scanner(System.in);
            long number = console.nextLong();

            int i =1;

            for (i = 1; i < number+1; i++) {
                System.out.print(i);
                if (i == number) {
                    System.out.print(" = ");
                }
                else {
                    System.out.print(" x ");}
            }

            System.out.println(fObject.fact(number));

    }

}
