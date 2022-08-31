package HomeWork2.loops;
/** Multiplies all the digits which @num consists of and
@return result of multiplication */

public class NumMultiply {

    public static long multiply(int num) {//123
        if (num ==0){
            return 0;
        }
        long result = 1;
        while (num > 0){
            int rest = num%10;
            result = result * rest;
            num = num/10;
        }
        return result;
    }
}
