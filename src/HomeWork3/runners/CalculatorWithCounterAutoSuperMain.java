package HomeWork3.runners;

import HomeWork3.calcs.additional.CalculatorWithCounterAutoSuper;

//calculate 4.1 + 15.0 * 7.0 + (28.0/5) * (28.0/5) using methods of class CalculatorWithCounterAutoSuper
//Print to console result of above operation and result of getCountOperation() method - number of calculator calls

public class CalculatorWithCounterAutoSuperMain {

    public static void main(String[] args) {
        CalculatorWithCounterAutoSuper calc = new CalculatorWithCounterAutoSuper();

        double a = calc.division(28, 5);
        double b = calc.raiseToPower(a, 2);
        double c = calc.multiplication(15, 7);
        double d = calc.adding(4.1, (b+c));

        System.out.println(d);

        System.out.println(calc.getCountOperation());

    }
}
