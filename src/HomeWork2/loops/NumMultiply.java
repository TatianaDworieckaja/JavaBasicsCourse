/* Эта программа перемноживает все цифры из числа введенного через аргумент к исполняемой программе между собой
 и выводит ход вычислений в консоль. Пользователь обязан ввести целое число. Если ввели не целое то выдать сообщение о том что
 пользователь ввёл некорректные данные.
*/

package HomeWork2.loops;

import java.util.Scanner;

public class NumMultiply {
    public static void main(String[] args) {
        System.out.printf("Provide integer: ");
        Scanner sc = new Scanner(System.in);

     if (sc.hasNextInt()) {

         int i = sc.nextInt();
         String str  = Integer.toString(i);
         StringBuilder sb = new StringBuilder(str);
         StringBuilder reverseStr = sb.reverse();
         String revString = reverseStr.toString();

         int i1 = Integer.parseInt(revString);

         int result = 1;

         while (i1>0) {
             int a = i1 % 10;//7, 2, 3
             result = result * a;//7, 14, 42
             i1 = i1 / 10;//32, 3, 0
             if (i1>0) {
                 System.out.print(a + " * ");//7 * 2 *
             } else {
                 System.out.print(a + " = " + result);
             }

         }

         }
     else if (sc.hasNextDouble()) {

         System.out.printf("You have provided non integer");

     } else if (sc.hasNextLine()) {

         System.out.printf("It is not a number");

     }
    }
}
