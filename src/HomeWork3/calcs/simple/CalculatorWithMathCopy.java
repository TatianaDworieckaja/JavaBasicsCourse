////Task 3
package HomeWork3.calcs.simple;

import HomeWork3.calcs.api.ICalculator;

//Class with four basic methods and three methods from Java Math library

public class CalculatorWithMathCopy implements ICalculator {

//four basic methods copied from CalculatorWithOperator class
    public double division(double x, double y) {
        double z = x / y;
        return z;
    }


    public double multiplication(double x, double y) {
        double z = x * y;
        return z;
    }


    public double subtraction  (double x, double y) {
        double z = x - y;
        return z;
    }


    public double adding(double x, double y) {
        double z = x + y;
        return z;
    }


    //methods of Math library
    /*method used to calculate number (x) raised to power (y) */
    public double raiseToPower (double x, double y){
        double number = Math.pow(x, y);
        return number;
}
    /*method used to calculate modulus of a number (x) */
    public double modulus (double x){
        double mod = Math.abs(x);
        return mod;
}
    /*method used to find square root from number x*/

    public double squareRoot (double x){
        double result =  Math.sqrt(x);
        return result;
    }
}
