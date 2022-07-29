package HomeWork3.calcs.simple;

//класс наследующий 4 метода из класса CalculatorWithOperator (деление, умножение, вычитание, сложение)
//и переопределяющий 3 метода из этого же класса

import HomeWork3.calcs.api.ICalculator;

public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator {

    //переоределение метода raiseToPower из класса CalculatorWithOperator, возводящего число в степень с пом. библиотеки Math
    @Override
    public double raiseToPower(double x, double y) {
        return Math.pow(x, y);
    }

    //переоределение метода из класса CalculatorWithOperator, калькулирующего квадратный корень числа с пом. библиотеки Math
    @Override
    public double squareRoot(double x) {
        return Math.sqrt(x);
    }

    //переоределение метода из класса CalculatorWithOperator, возращающего модуль числа с пом. библиотеки Math
    @Override
    public double modulus(double x) {
        return Math.abs(x);
    }
}




