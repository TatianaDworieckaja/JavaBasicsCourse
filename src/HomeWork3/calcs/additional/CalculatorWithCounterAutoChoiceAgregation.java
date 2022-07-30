package HomeWork3.calcs.additional;

import HomeWork3.calcs.simple.CalculatorWithMathCopy;
import HomeWork3.calcs.simple.CalculatorWithMathExtends;
import HomeWork3.calcs.simple.CalculatorWithOperator;

//класс, тиеющий три варианта конструктора, принимающих три объекта разного типа.

public class CalculatorWithCounterAutoChoiceAgregation {
    private long count = 0;

    public long getCountOperation(){
    return count;
}

    private CalculatorWithOperator calculator1;
    private CalculatorWithMathCopy calculator2;
    private CalculatorWithMathExtends calculator3;


    public CalculatorWithCounterAutoChoiceAgregation (CalculatorWithOperator calcOfThisType){

        this.calculator1 = calcOfThisType;
    }

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathCopy calcOfThisType){
        this.calculator2 = calcOfThisType;
    }

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathExtends calcOfThisType){
        this.calculator3 = calcOfThisType;
    }


    public double addition (double x, double y) {
        count ++;
        if (calculator1 != null){
            return calculator1.adding(x, y);
        } else if (calculator2 != null){
            return calculator2.adding(x, y);
        }else{
            return calculator3.adding(x, y);
        }
    }

    public double subtraction(double x, double y) {
        count++;
        if (calculator1 != null) {
            return calculator1.subtraction(x, y);
        } else if (calculator2 != null) {
            return calculator1.subtraction(x, y);
        } else {
            return calculator3.subtraction(x, y);
        }
    }

    public double division (double x, double y) {
        count++;
        if (calculator1 != null){
            return calculator1.division(x, y);
        } else if (calculator2 != null){
            return calculator2.division(x, y);
        }else{
            return calculator3.division(x, y);
        }

    }

    public double multiplication (double x, double y) {
        count++;
        if (calculator1 != null){
            return calculator1.multiplication(x, y);
        } else if (calculator2 != null){
            return calculator2.multiplication(x, y);
        }else{
            return calculator3.multiplication(x, y);
        }
    }

    public double raiseToPower (double x, double y){
        count++;
        if (calculator1 != null){
            return calculator1.raiseToPower (x, y);
        } else if (calculator2 != null){
            return calculator2.raiseToPower(x, y);
        }else{
            return calculator3.raiseToPower (x, y);
        }
    }
    public double mod(double x){
        count++;
        if (calculator1 != null){
            return calculator1.modulus(x);
        } else if (calculator2 != null){
            return calculator2.modulus(x);
        }else{
            return calculator3.modulus(x);
        }
    }

    public double squareRoot (double x){
        count++;
        if (calculator1 != null){
            return calculator1.squareRoot(x);
        } else if (calculator2 != null){
            return calculator2.squareRoot(x);
        }else{
            return calculator3.squareRoot(x);
        }
    }
}
