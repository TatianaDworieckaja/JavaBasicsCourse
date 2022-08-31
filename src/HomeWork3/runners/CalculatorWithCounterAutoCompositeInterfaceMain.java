package HomeWork3.runners;

import HomeWork3.calcs.api.ICalculator;
import HomeWork3.calcs.simple.CalculatorWithMathCopy;
import HomeWork3.calcs.simple.CalculatorWithOperator;
import HomeWork3.calcs.additional.CalculatorWithCounterAutoAgregationInterface;

//usage of calculator object from the class implementing interface ICalculator

public class CalculatorWithCounterAutoCompositeInterfaceMain {

    public static void main(String[] args) {

        ICalculator calc = new CalculatorWithMathCopy();
        CalculatorWithCounterAutoAgregationInterface calculatorMain = new CalculatorWithCounterAutoAgregationInterface(calc);

        double a = calculatorMain.division(28, 5);
        double b = calculatorMain.raiseToPower(a, 2);
        double c = calculatorMain.multiplication(15, 7);
        double result = calculatorMain.adding(4.1, (b+c));

        System.out.println(result);

        System.out.println(calculatorMain.getCountOperation());

    }
}
