package HomeWork3.runners;
//class containing main method with new object of CalculatorWithCounterAutoComposite class, allowing to calculate
// 4.1 + 15.0 * 7.0 + (28.0/5) * (28.0/5);

import HomeWork3.calcs.additional.CalculatorWithCounterAutoComposite;

public class CalculatorWithCounterDelegateCompositeMain {

    public static void main(String[] args) {
        CalculatorWithCounterAutoComposite calculator = new CalculatorWithCounterAutoComposite();

        double a = calculator.division(28.0, 5);
        double b = calculator.multiplication(15, 7);
        double c = calculator.raiseToPower(a, 2);
        double e = calculator.addition(4.1, b + c);

        System.out.println(e);
        System.out.println("number of calculator calls is: " + calculator.getCountOperation());

    }

}
