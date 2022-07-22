package HomeWork2.loops;

import java.util.Random;
import java.util.Scanner;

public class NumMethods {
    public static void main(String[] args) {
        //task 1.5.1
        System.out.println("Provide integer number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("1. Find max integer in provided number");
        System.out.println("The max integer in provided number " + a + " is: " + NumMethods.max(a));
        System.out.println();

        //task 1.5.3
        System.out.println("2. Check the number of even and odd digits in provided number");
        int result[] = evenAndOdd(a);
        System.out.println("The number of even integers in number " + a + " is: " + result[0]);
        System.out.println("The number of odd integers is: " + result[1]);
        System.out.println();

        //task 1.5.2
        System.out.println("3. Check if the random generator works correctly");
        System.out.println("Probability of getting odd numbers is: " + NumMethods.percentage() + "%");
        System.out.println();

        //task 1.5.4
        System.out.println("4. Now we're going to create Fibonacci series");
        System.out.println(fibSeq());

        System.out.println();
        System.out.println();

        //task 1.5.5

        System.out.println("5. Now we are going to create a series of numbers with a specific step.");
        System.out.println(seriesWithStep());
        System.out.println();

        //task 1.5.6
        System.out.printf("Now we're going to reverse a number.");
        numReverse();
        System.out.println();
    }

    /*This is a method which return the max integer in provided  number.
    @param n - number (e.g. provided by a user)
    @param m - the starting digit (last in the number) compared with k. Then the digit with max value is assigned to m.
    @param k - digit which is compared to max digit.
    @return m - the digit with max value among the all ones in the provided number */

    public static int max(int n) {

        int m = n % 10;//отделяем посленюю цифру и присваиваем ее переменной m
        n = n / 10;// отрезаем последнюю цифру от числа
        int k;
        while (n > 0) {
            k = n % 10;//3
            if (k > m) {
                m = k;
            }
            n = n / 10;
        }
        return m;
    }

    /* This is a method which return a percentage of even numbers in random selection
    @param n - size of random selection
    @param array[] - array for saving numbers of even and odd random numbers in the selection. Array is needed to return two values
    */

    public static float percentage() {
        int n = 1000;
        int array[] = new int[n];
        int counter = 0;
        Random num = new Random();

        for (int i = 0; i < n; i++) {

            array[i] = num.nextInt();
            if (array[i] % 2 == 0) {
                counter = counter + 1;
            }
        }
        float p = counter * 100 / n;
        return p;
    }


    /* This is method which counts even and odd integers in provided number
     * @param num - this is a number (e.g. provided by user)
     * @return e and o - the number of even and odd integers respectively */

    public static int[] evenAndOdd(int num) {
        int e = 0;
        int o = 0;
        while (num > 0) {
            if (num % 2 == 0) {
                e++;
            } else {
                o++;
            }
            num = num / 10;
        }
        return new int[]{e, o};//Return an array of values for even and odd results, because multi-value returns are not possible
    }

    /* This is a method which returns Fibonacci sequence
    @param n - length of Fibonacci series
    @param prev - previous number in Fibonacci series
    @param next - the next number in Fibonacci series
    @return result - contains all numbers in Fibonacci series with lengh n

   */
    public static String fibSeq() {

        System.out.println("Provide number for Fibonacci series: ");
        Scanner sc = new Scanner(System.in);
        int fnum = sc.nextInt();

        long prev = 0;
        long next = 1;
        String result = prev + " " + next;

        if (fnum == 0) {
            System.out.println("See you later");
        } else if (fnum == 1) {
            System.out.println("Not enough to get a nice series");
        } else {
            for (int i = 3; i < fnum + 1; i++) {
                long sum = prev + next;
                result = result + " " + sum;
                prev = next;
                next = sum;
            }

        }
        return result;
    }


    /* This is a method which returns series of numbers in specific range with specific step (provided by a user)
    @param start - number with which the range starts
    @param finish - number with which the range finishes
    @param step  - step or result of substraction of previous number from the next one in the range

     */
    public static String seriesWithStep() {

        System.out.printf("Provide a number to start the range: ");
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        System.out.printf("Provide a number to finish the range: ");
        int finish = sc.nextInt();
        System.out.printf("Provide a step between numbers: ");
        int step = sc.nextInt();

        String result = start + " ";
        int next;

        for (int i = 2; i < finish + 1; i++) {

            start += step;

            result = result + start + " ";
        }
        System.out.print("Your range is: ");
        return result;
    }

    /*The method which allows to reverse the number (321 instead of 123) and to print it out.
    * @param num  - number provided by a user
    * @param num1 - number provided by the user and cut during the cycle
    * @param revnum - reversed number
    * */
    public static void numReverse() {
        System.out.printf("Provide a number to reverse it: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num1 = num;
        int revnum = 0;
        while (num1 > 0) {
            revnum = revnum * 10 + num1 % 10;
            num1 = num1 / 10;
        }
        System.out.print("The reversed version of " + num + " is " + revnum);
    }
}


