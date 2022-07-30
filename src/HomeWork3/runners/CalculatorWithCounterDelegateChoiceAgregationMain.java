package HomeWork3.runners;

import HomeWork3.calcs.additional.CalculatorWithCounterAutoChoiceAgregation;
import HomeWork3.calcs.simple.CalculatorWithMathCopy;
import HomeWork3.calcs.simple.CalculatorWithMathExtends;
import HomeWork3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterDelegateChoiceAgregationMain {
    public static void main(String[] args) {

        //используем экземпляр калькулятора CalculatorWithOperator

        CalculatorWithOperator calc1 = new CalculatorWithOperator();
        CalculatorWithCounterAutoChoiceAgregation calculator1 = new CalculatorWithCounterAutoChoiceAgregation(calc1);

        double a1 = calculator1.division(28, 5);
        double b1 = calculator1.raiseToPower(a1, 2);
        double c1 = calculator1.multiplication(15, 7);
        double result1 = calculator1.addition(4.1, b1 + c1);

        System.out.println(result1);
        System.out.println("number of calculator calls is: " + calculator1.getCountOperation());


        //используем экземпляр калькулятора CalculatorWithMathCopy
        CalculatorWithMathCopy calc2 = new CalculatorWithMathCopy();
        CalculatorWithCounterAutoChoiceAgregation calculator2 = new CalculatorWithCounterAutoChoiceAgregation(calc2);

        double a2 = calculator2.division(28.0, 5);
        double b2 = calculator2.raiseToPower(a2, 2);
        double c2 = calculator2.multiplication(15, 7);
        double result2 = calculator2.addition(4.1, b2 + c2);

        System.out.println(result2);
        System.out.println("number of calculator calls is: " + calculator1.getCountOperation());


        //используем экземпляр калькулятора CalculatorWithMathExtends

        CalculatorWithMathExtends calc3 = new CalculatorWithMathExtends();
        CalculatorWithCounterAutoChoiceAgregation calculator3 = new CalculatorWithCounterAutoChoiceAgregation(calc2);

        double a3 = calculator2.division(28.0, 5);
        double b3 = calculator2.raiseToPower(a3, 2);
        double c3 = calculator2.multiplication(15, 7);
        double result3 = calculator2.addition(4.1, b3 + c3);

        System.out.println(result3);
        System.out.println("number of calculator calls is: " + calculator1.getCountOperation());

    }
}
