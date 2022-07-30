package HomeWork3.runners;

import HomeWork3.calcs.simple.CalculatorWithMathExtends;
//class containing method calculating math operation as below using methods of CalculatorWithMathExtends class
// print to console result of:  4.1 + 15 * 7 + (28/5) * (28/5);

public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {

        CalculatorWithMathExtends calc = new CalculatorWithMathExtends();

        double a = calc.division(28, 5);
        double b = calc.raiseToPower(a, 2);
        double c = calc.multiplication(15, 7);
        double result  = calc.adding(4.1, (b+c));

        System.out.println(result);

    }
}
