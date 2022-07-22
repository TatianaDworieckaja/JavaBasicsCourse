

package HomeWork2.loops;

import java.util.Scanner;
//Эта программа перемноживает  числа от 1 до числа (включительно) введенного через аргумент к исполняемой программе. Используя только цикл

public class Cycles_1_1_1 {
    public static void main(String[] args) {
        System.out.println("Provide any positive number here:");
        Scanner console = new Scanner(System.in);
        long num = console.nextInt();

        long count = 1;
        int i =1;

        for (i = 1; i < num+1; i++) {
            System.out.print(i);
            if (i == num) {
                System.out.print(" = ");
            }
            else {
            System.out.print(" x ");}

            count = count * i;
        }
        System.out.print(count);
        }
  }

