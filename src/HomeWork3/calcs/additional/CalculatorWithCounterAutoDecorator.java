package HomeWork3.calcs.additional;

import HomeWork3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoDecorator<CALC extends ICalculator> implements ICalculator{

    private CALC calculator;

    private long count;

    public CalculatorWithCounterAutoDecorator (CALC calculator) {
        this.calculator = calculator;
    }

        private void incrementCountOperation(){
            count++;
        }

        public long getCountOperation(){
            return this.count;
        }

        public double division (double x, double y){
            incrementCountOperation();
            return calculator.division(x, y);
        }

        public double multiplication (double x, double y) {
            incrementCountOperation();
            return calculator.multiplication(x, y);
        }

        public double subtraction(double x, double y){
            incrementCountOperation();
            return calculator.subtraction(x, y);
        }

        public double adding (double x, double y){
            incrementCountOperation();
            return calculator.adding(x, y);
        }

        public double raiseToPower (double x, int y){
            incrementCountOperation();
            return calculator.raiseToPower(x, y);
        }

        public double modulus(double x) {
            incrementCountOperation();
            return calculator.modulus(x);
        }

        public double squareRoot(double x) {
            incrementCountOperation();
            return calculator.squareRoot(x);
        }

        public CALC getCalculator(){
            return this.calculator;
        }

}



