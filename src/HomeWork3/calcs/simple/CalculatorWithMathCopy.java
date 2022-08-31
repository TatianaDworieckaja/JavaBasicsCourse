////Task 3
package HomeWork3.calcs.simple;

import HomeWork3.calcs.api.ICalculator;

/** Class with four basic methods and three methods from Java Math library*/

public class CalculatorWithMathCopy implements ICalculator {

//four basic methods copied from CalculatorWithOperator class
    public double division(double x, double y) {
        return x / y;
    }


    public double multiplication(double x, double y) {
        return x * y;
    }


    public double subtraction  (double x, double y) {
        return x - y;
    }


    public double adding(double x, double y) {
        return x + y;
    }


    //methods of Math library
    /*method used to calculate number (x) raised to power (y) */
    public double raiseToPower (double x, int y){
        return Math.pow(x, y);
}
    /*method used to calculate modulus of a number (x) */
    public double modulus (double x){
        return Math.abs(x);
}
    /*method used to find square root from number x*/

    public double squareRoot (double x){
        return Math.sqrt(x);
    }
}
