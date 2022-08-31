package HomeWork2.loops;

public class Factorial {
    /** create recursion method in Factorial class*/
    public static long fact(long x) {
        if (x == 0 || x == 1) {
            return x;
        }
        return fact(x - 1) * x;
    }
}

