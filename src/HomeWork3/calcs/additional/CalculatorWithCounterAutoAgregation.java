package HomeWork3.calcs.additional;

import HomeWork3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterAutoAgregation {

    private final CalculatorWithMathCopy newCalc;//создание поля типа CalculatorWithMathCopy


    public CalculatorWithCounterAutoAgregation(CalculatorWithMathCopy newCalc){

        this.newCalc = newCalc; //инициализация поля в рамках конструтора
    }

    //счётчик вызовов калькулятора
    private long count = 0;

    public void incrementCountOperation() {
        count++;
    }

    public long getCountOperation(){
        return count;
    }


    /*Division method*/

    public double division(double x, double y) {
        incrementCountOperation();
        return newCalc.division(x, y);
    }

    /* Multiplication*/

    public double multiplication(double x, double y) {
        incrementCountOperation();
        return newCalc.multiplication(x, y);
    }

    /*subtraction method*/

    public double subtraction(double x, double y) {
        incrementCountOperation();
        return newCalc.subtraction(x, y);
    }

    /*addition*/

    public double addition(double x, double y) {
        incrementCountOperation();
        return newCalc.adding(x, y);
    }

    /*The method of exponentiation of a positive fractional number*/

    public double raiseToPower(double value, int power) {
        incrementCountOperation();
        return newCalc.raiseToPower(value, power);
    }
    /* modulus of a number */

    public double modulus (double x){
        incrementCountOperation();
        return newCalc.modulus(x);
    }

    /*Square root
    Following formula is used to find square root: sqrt(n+1)=(sqrt(n)+(x/sqrt(n)))/2.0
     */
    public double squareRoot (double x){
        incrementCountOperation();
        return newCalc.squareRoot(x);
    }




}
