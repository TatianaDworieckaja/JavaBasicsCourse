package HomeWork3.runners;

import HomeWork3.calcs.additional.CalculatorWithCounterAutoDecorator;
import HomeWork3.calcs.additional.CalculatorWithMemory;
import HomeWork3.calcs.api.ICalculator;
import HomeWork3.calcs.simple.CalculatorWithOperator;

public class CalculatorDecoratorMain2 {
    public static void main(String[] args) {
        CalculatorWithCounterAutoDecorator<CalculatorWithMemory>  decorator =
                new CalculatorWithCounterAutoDecorator<>(new CalculatorWithMemory(
                        new CalculatorWithOperator()));

        double a = decorator.division(28, 5);
        double b = decorator.raiseToPower(a, 2);
        double c = decorator.multiplication(15, 7);
        double result = decorator.adding(4.1, (b + c));

        System.out.println(result);
        System.out.println(decorator.getCountOperation());

        CalculatorWithMemory calculator = decorator.getCalculator();
        calculator.addMemory();
        System.out.println(calculator.getMemory());
    }
}
