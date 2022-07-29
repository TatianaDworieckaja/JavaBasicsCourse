package HomeWork3.runners;

//The class contains a method allowing to use methods of classes CalculatorWithMathCopy and CalculatorWithCounterAutoAgregation
// to calculate 4.1 + 15 * 7 + (28/5) * (28/5)

import HomeWork3.calcs.additional.CalculatorWithCounterAutoAgregation;
import HomeWork3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterDelegateAgregationMain {
    public static void main(String[] args) {
        CalculatorWithMathCopy mathCopyCalc = new CalculatorWithMathCopy();//creation and initialization of the field.

        CalculatorWithCounterAutoAgregation newCalcMain = new CalculatorWithCounterAutoAgregation(mathCopyCalc);//creation of object of CalculatorWithCounterAutoAgregation class

        double division = newCalcMain.division(28.0, 5);
        double multiplication = newCalcMain.multiplication(15, 7);
        double pow = newCalcMain.exponent(division, 2);
        double addition = newCalcMain.addition(4.1, multiplication );
        double result = newCalcMain.addition(addition, pow);

        System.out.println(result);
        System.out.println("number of calculator calls is: " + newCalcMain.getCountOperation());

    }
}

