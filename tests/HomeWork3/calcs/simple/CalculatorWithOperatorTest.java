package HomeWork3.calcs.simple;

import HomeWork3.calcs.api.ICalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorWithOperatorTest {
    private final ICalculator calculator = new CalculatorWithOperator();


    @Test
    public void division() {
        Assertions.assertEquals(5.6, calculator.division(28, 5));
    }

    //@Test
    //public void divZero(){
    //    Assertions.assertEquals(Double.POSITIVE_INFINITY, calculator.division(4, 0));
    //}


    @Test
    public void raiseToPower() {
        Assertions.assertEquals (31.359999999999996, calculator.raiseToPower(5.6, 2));
    }

    @Test
    public void multiplication() {
        Assertions.assertEquals (105, calculator.multiplication(15, 7));
    }

    @Test
    public void adding() {
        Assertions.assertEquals (140.45999999999998, calculator.adding(4.1, 31.359999999999996 + 105));
    }

    @Test
    public void subtraction() {
        Assertions.assertEquals (23, calculator.subtraction(28, 5));
    }

    @Test
    public void squareRoot() {
        Assertions.assertEquals (2, calculator.squareRoot(4));
    }

    @Test
    public void modulus() {
        Assertions.assertEquals (15, calculator.modulus(-15));
    }

    @Test
    public void testCalculator() {
        Assertions.assertEquals(140.45999999999998, calculator.adding(calculator.multiplication(15, 7), calculator.adding(4.1, calculator.raiseToPower(calculator.division(28, 5), 2))));
    }

}