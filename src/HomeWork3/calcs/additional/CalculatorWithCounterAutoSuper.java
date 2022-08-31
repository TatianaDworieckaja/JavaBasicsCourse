package HomeWork3.calcs.additional;

import HomeWork3.calcs.simple.CalculatorWithMathExtends;
/** Класс CalculatorWithCounterAutoSuper, наследующий CalculatorWithMathExtends,
 * который переопределяет все методы родительского класса CalculatorWithMathExtends */

// c добавлением счётчика вызовов и обращением к методам родительского класса с помощью клчевого слова super.
//Класс описывает метод getCountOperation(), который возвращает количество использований данного калькулятора

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {
    private long callCounter;
    private void incrementCountOperation(){callCounter++;}

    public long getCountOperation(){
       return callCounter;
    }

    @Override
    public double raiseToPower(double x, int y) {
        incrementCountOperation();
        return super.raiseToPower(x, y);
    }

    @Override
    public double squareRoot(double x) {
        incrementCountOperation();
        return super.squareRoot(x);
    }

    @Override
    public double modulus(double x) {
        incrementCountOperation();
        return super.modulus(x);
    }

    @Override
    public double adding(double x, double y) {
        incrementCountOperation();
        return super.adding(x, y);
    }

    @Override
    public double division(double x, double y) {
        incrementCountOperation();
        return super.division(x, y);
    }

    @Override
    public double multiplication(double x, double y) {
        incrementCountOperation();
        return super.multiplication(x, y);
    }

    @Override
    public double subtraction(double x, double y) {
        incrementCountOperation();
        return super.subtraction(x, y);
    }


}

