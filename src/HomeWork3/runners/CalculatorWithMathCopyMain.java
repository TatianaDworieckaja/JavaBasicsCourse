//Task 3
package HomeWork3.runners;

import HomeWork3.calcs.simple.CalculatorWithMathCopy;

//class containing method calculating math operation as below using methods of CalculatorWithMathCopy class
// print to console result of:  4.1 + 15 * 7 + (28/5) * (28/5);

public class CalculatorWithMathCopyMain {

    public static void main(String[] args) {

        CalculatorWithMathCopy calc = new CalculatorWithMathCopy();//create new object of class CalculatorWithMathCopy
        double a = calc.division(28, 5);
        double b = calc.raiseToPower(a, 2);
        double c = calc.multiplication(15, 7);
        double result = calc.adding(4.1, (b + c));

        System.out.println(result);
    }
}

