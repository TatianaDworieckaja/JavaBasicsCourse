package HomeWork2.loops;

public class Factorial {
    //create recursion method in Factorial class
    long fact(long num) {

        long count = 1;

        if (num == 1) {
            return 1;
        }
        count = fact(num - 1) * num;// 1=5* fact(4), 
        return count;
    }
}

