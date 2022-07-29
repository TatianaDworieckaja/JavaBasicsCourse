package HomeWork3.calcs.additional;

public class CalculatorWithCounterAutoComposite {



    CalculatorWithCounterAutoSuper newCalc = new CalculatorWithCounterAutoSuper();


    public double raiseToPower (double x, double y) {
        return newCalc.raiseToPower(x, y);
    }


    public double squareRoot(double x) {
        return newCalc.squareRoot(x);
    }


    public double modulus(double x) {
        return newCalc.modulus(x);
    }


    public double addition(double x, double y) {
        return newCalc.adding(x, y);
    }


    public double division(double x, double y) {
        return newCalc.division(x, y);
    }


    public double multiplication(double x, double y) {
        return newCalc.multiplication(x, y);
    }


    public double substraction(double x, double y) {
        return newCalc.subtraction(x, y);
    }


    public long getCountOperation() {
        return newCalc.getCountOperation();
    }

}

