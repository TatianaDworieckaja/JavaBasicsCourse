package HomeWork3.calcs.additional;

import HomeWork3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoAgregationInterface {

    private final ICalculator calculator;
    public CalculatorWithCounterAutoAgregationInterface (ICalculator calculator){
       this.calculator = calculator;
   }

   private long count = 0;

    public long getCountOperation(){
        return count;
    }

    public double division (double x, double y){
        count++;
        return calculator.division(x, y);
    }

    public double multiplication (double x, double y) {
        count++;
        return calculator.multiplication(x, y);
    }

    public double subtraction(double x, double y){
        count++;
        return calculator.subtraction(x, y);
    }

    public double adding (double x, double y){
        count++;
        return calculator.adding(x, y);
    }

    public double raiseToPower (double x, double y){
        count++;
        return calculator.raiseToPower(x, y);
    }

    public double modulus(double x) {
        count++;
        return calculator.modulus(x);
    }

    public double squareRoot(double x) {
        count++;
        return calculator.squareRoot(x);
    }
}
