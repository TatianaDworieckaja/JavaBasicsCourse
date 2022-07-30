//Task 2

package HomeWork3.runners;

import HomeWork3.calcs.simple.CalculatorWithOperator;

//class with method containing object of CalculatorWithOperator class, which is used to calculate
// simple math operation 4.1 + 15 * 7 + (28/5) * (28/5).
public class CalculatorWithOperatorMain {

    public static void main(String[] args) {

        CalculatorWithOperator calc = new CalculatorWithOperator();

        double a =  calc.division(28, 5);
        double b = calc.multiplication(15, 7);
        double c = calc.raiseToPower(a, 2);
        double result = calc.adding(4.1, (b+c));
        System.out.println(result);

    }

}
