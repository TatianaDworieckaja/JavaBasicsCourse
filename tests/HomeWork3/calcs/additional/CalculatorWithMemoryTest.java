package HomeWork3.calcs.additional;

import HomeWork3.calcs.simple.CalculatorWithMathCopy;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorWithMemoryTest {

    private final CalculatorWithMemory calculator = new CalculatorWithMemory(new CalculatorWithMathCopy());

    @Test
    public void adding() {
        Assertions.assertEquals(5, calculator.adding(2, 3));
    }

    @Test
    public void subtraction() {
        Assertions.assertEquals(3, calculator.subtraction(7, 4));
    }

    @Test
    public void multiplication() {
        Assertions.assertEquals(8, calculator.multiplication(2, 4));
    }

    @Test
    public void division() {
        Assertions.assertEquals(3, calculator.division(9, 3));
    }

    @Test
    public void exponentiation() {
        Assertions.assertEquals(25, calculator.raiseToPower(5, 2));
    }

    @Test
    public void numberModulus() {
        Assertions.assertEquals(4, calculator.modulus(-4));
    }

    @Test
    public void squareRoot() {
        Assertions.assertEquals(3, calculator.squareRoot(9));
    }

    @Test
    public void testCalculator() {
        Assertions.assertEquals(140.45999999999998, calculator.adding(calculator.multiplication(15, 7), calculator.adding(4.1, calculator.raiseToPower(calculator.division(28, 5), 2))));
    }
}