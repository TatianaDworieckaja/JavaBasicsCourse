package HomeWork3.calcs.additional;

import HomeWork3.calcs.simple.CalculatorWithMathExtends;
//Класс CalculatorWithCounterAutoSuper, наследующий CalculatorWithMathExtends,
// который переопределяет все методы родительского класса CalculatorWithMathExtends
// c добавлением счётчика вызовов и обращением к методам родительского класса с помощью клчевого слова super.
//Класс описывает метод getCountOperation(), который возвращает количество использований данного калькулятора

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {
    private int callCounter = 0;

    public long getCountOperation(){
       return callCounter;
    }

    @Override
    public double raiseToPower(double x, int y) {
        callCounter++;
        return super.raiseToPower(x, y);
    }

    @Override
    public double squareRoot(double x) {
        callCounter++;
        return super.squareRoot(x);
    }

    @Override
    public double modulus(double x) {
        callCounter++;
        return super.modulus(x);
    }

    @Override
    public double adding(double x, double y) {
        callCounter++;
        return super.adding(x, y);
    }

    @Override
    public double division(double x, double y) {
        callCounter++;
        return super.division(x, y);
    }

    @Override
    public double multiplication(double x, double y) {
        callCounter++;
        return super.multiplication(x, y);
    }

    @Override
    public double subtraction(double x, double y) {
        callCounter++;
        return super.subtraction(x, y);
    }


}

