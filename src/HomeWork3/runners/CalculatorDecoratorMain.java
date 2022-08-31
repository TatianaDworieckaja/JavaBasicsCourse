package HomeWork3.runners;

import HomeWork3.calcs.additional.CalculatorWithCounterAutoDecorator;
import HomeWork3.calcs.additional.CalculatorWithMemory;
import HomeWork3.calcs.api.ICalculator;
import HomeWork3.calcs.simple.CalculatorWithOperator;

public class CalculatorDecoratorMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoDecorator decorator = //decorator ont operations
            new CalculatorWithCounterAutoDecorator(new CalculatorWithMemory( //memory - saves in memory
                    new CalculatorWithOperator()));//use methods to calculate

        double a =  decorator.division(28, 5);
        double b = decorator.raiseToPower(a, 2);
        double c = decorator.multiplication(15, 7);
        double result = decorator.adding(4.1, (b+c));

        System.out.println(result);
        System.out.println(decorator.getCountOperation());

        ICalculator calculator = decorator.getCalculator();



        //уточняем какого типа объект хоанится за ссылкой calculator - точно ли Calculatorwith memory чтобы не получилось ошибки

        if (calculator instanceof CalculatorWithMemory){
            ((CalculatorWithMemory) calculator).addMemory();
            System.out.println(((CalculatorWithMemory) calculator).getMemory());
        }


    }
}
