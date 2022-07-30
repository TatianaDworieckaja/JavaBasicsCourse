//Task 2
package HomeWork3.calcs.simple;
import HomeWork3.calcs.api.ICalculator;

/* This is a class containing mathematical methods*/

public class CalculatorWithOperator implements ICalculator {


    public double division(double x, double y) {
        return x / y;
    }


    public double multiplication(double x, double y) {
        return x * y;
    }


    public double subtraction(double x, double y) {
        return x - y;
    }


    public double adding(double x, double y) {
        return x + y;
    }

    /*The method of exponentiation of a positive fractional number*/

    public double raiseToPower(double value, double power) {
        double result = 1;
        for (int i = 1; i <= power; i++) {
            result = result * value;
        }
        return result;
    }


    /* modulus of a number */

    public double modulus (double x){
        if (x < 0){
            x = -x;
        }
        return x;
    }

    /*Square root
    Following formula is used to find square root: sqrt(n+1)=(sqrt(n)+(x/sqrt(n)))/2.0
     */
    public double squareRoot (double x){
        //temporary variable
        double t;
        double sqrtroot = x / 2;
        do
        {
            t=sqrtroot;
            sqrtroot=(t+(x/t))/2;
        }
        while((t-sqrtroot)!= 0);
        return sqrtroot;
    }

}








