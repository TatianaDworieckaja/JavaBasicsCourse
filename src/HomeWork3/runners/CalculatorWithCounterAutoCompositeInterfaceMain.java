package HomeWork3.runners;

import HomeWork3.calcs.api.ICalculator;
import HomeWork3.calcs.simple.CalculatorWithOperator;
import HomeWork3.calcs.additional.CalculatorWithCounterAutoAgregationInterface;

//usage of calculator object from the class implementing interface ICalculator

public class CalculatorWithCounterAutoCompositeInterfaceMain {

    public static void main(String[] args) {

        ICalculator calc = new CalculatorWithOperator();
        CalculatorWithCounterAutoAgregationInterface calculatorMain = new CalculatorWithCounterAutoAgregationInterface(calc);

        double a = calculatorMain.division(28.0, 5);
        double b = calculatorMain.multiplication(15, 7);
        double c = calculatorMain.raiseToPower(a, 2);
        double result = calculatorMain.adding(4.1, (b+c));

        System.out.println(result);

        System.out.println(calculatorMain.getCountOperation());

    }
}
