package HomeWork3.runners;


import HomeWork3.calcs.additional.CalculatorWithCounterClassic;

//class containing method with object of CalculatorWithCounterClassic
// allows to calculate 4.1 + 15.0 * 7.0 + (28.0/5) * (28.0/5) using the method from the class;
//returns the number of calls to calculator using getCountOperation().

public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {

    CalculatorWithCounterClassic calc = new CalculatorWithCounterClassic();//new object of CalculatorWithCounterClassic is created

    double a = calc.division(28.0, 5);
    calc.incrementCountOperation();
    double b = calc.multiplication(15.0, 7.0);
    calc.incrementCountOperation();
    double c = calc.raiseToPower(a, 2);
    calc.incrementCountOperation();
    double d = calc.adding(4.1, (b+c));
    calc.incrementCountOperation();
    double result = d;
    System.out.println(result);
    System.out.println(calc.getCountOperation());



    }
}
