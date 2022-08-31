package HomeWork2.loops;

public class NumToPow {

    //create paw method for exponentiation operation

    public static double pow(double base, int powValue) {
        if (powValue==0){
            return 1;
        }
        double result  = 1;
        for (int a = 1; a <= powValue; a++) {
            result = result * base;
        }
        return result;
    }

}
