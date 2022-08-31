package HomeWork2.loops;

public class Factorial {
    //create recursion method in Factorial class
    public static long fact(long x) {
        if (x == 0 || x == 1) {
            return x;
        }
        long count = 1;
        count = fact(x - 1) * x;// 1=5* fact(4),
        return count;
    }
}

