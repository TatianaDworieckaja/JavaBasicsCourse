package HomeWork2.loops;

public class NumMethods {

    /**This is a method which return the max integer in provided  number.
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

    /** This is a method which return a percentage of even numbers in random selection
    @param n - size of random selection
    @param array[] - array for saving numbers of even and odd random numbers in the selection. Array is needed to return two values
    */

    public static float percentage(int[] array) {
        float counter = 0;
        for (int j : array) {
            if (j % 2 == 0) {
                counter = counter + 1;
            }
        }
        return counter * 100 / array.length;

    }


    /** This is method which counts even and odd integers in provided number
     * @param num - this is a number (e.g. provided by user)
     * @return e and o - the number of even and odd integers respectively */

    public static String evenAndOdd(int num) {
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
        return "even: " + e + ", odd: " + o;
    }

    /** This is a method which returns Fibonacci sequence
    @param n - length of Fibonacci series
    @param prev - previous number in Fibonacci series
    @param next - the next number in Fibonacci series
    @return result - contains all numbers in Fibonacci series with lengh n

   */
    public static String fibSeq(int fnum) {
        long prev = 0;
        long next = 1;
        StringBuilder result = new StringBuilder();
        if (fnum <= 0){
            result = new StringBuilder("See you");
        }
        else if (fnum ==1){
            result.append(prev).append(" ").append(next);
        }

        result.append(prev).append(" ").append(next);
        for (int i = 2; i <= fnum; i++) {
            long sum = prev + next;
            result.append(" ").append(sum);
            prev = next;
            next = sum;
            }
        return result.toString();
        }



    /** This is a method which returns series of numbers in specific range with specific step (provided by a user)
    @param start - number with which the range starts
    @param finish - number with which the range finishes
    @param step  - step or result of substraction of previous number from the next one in the range

     */
    public static String seriesWithStep(int start, int finish, int step) {

        StringBuilder str = new StringBuilder(start + " ");

        for (int i = 1; i < finish; i++) {
            start += step;
            str.append(start).append(" ");
        }
        str.deleteCharAt(str.length()-1);
        return str.toString();
    }

    /** The method which allows to reverse the number (321 instead of 123) and to print it out.
    * @param num  - number provided by a user
    * @param num1 - number provided by the user and cut during the cycle
    * @param revnum - reversed number
    * */
    public static String numReverse(int num) {
        StringBuilder str = new StringBuilder();
        int x;
        while (num > 0) {
            x =  num % 10;
            num = num / 10;
            str.append(x);
        }
        return str.toString();
    }
}


