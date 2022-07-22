/* Эта программа позволяет возвести число в степень. Через консоль пользователь вводит два числа.
@param b - Первое число это число которое мы будем возводить
@param n - Второе число - это степень.*/

package HomeWork2.loops;

import java.util.Scanner;

public class NumToPow {

    //create paw method for exponentiation operation

    public static double pow(double base, int powValue) {
        double result  = 1;

        for (int a = 1; a <= powValue; a++) {
            result = result * base;
        }
        return result;

    }
    public static void main(String[] args) {
        System.out.println("Please provide a base for exponentiation here. It can be integer, non integer, positive or negative:  ");
        Scanner sc = new Scanner(System.in);
        double b = sc.nextDouble();
        System.out.println("Please provide a power (exponent) here. It can be positive and integer only: ");
        int n = sc.nextInt();

        System.out.println (b + " ^ " + n + " = " + NumToPow.pow (b, n));
    }

}
