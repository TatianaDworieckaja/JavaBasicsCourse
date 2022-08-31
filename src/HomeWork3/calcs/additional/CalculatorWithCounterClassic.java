package HomeWork3.calcs.additional;

import HomeWork3.calcs.simple.CalculatorWithMathExtends;

/** class which extends CalculatorWithMathExtends class
contains two additional methods allowing to count number of calls for calculator */

public class CalculatorWithCounterClassic extends CalculatorWithMathExtends
{
    private int count;
    public void incrementCountOperation() {
        count++;
    }

    public long getCountOperation() {
        return count;
    }
}





