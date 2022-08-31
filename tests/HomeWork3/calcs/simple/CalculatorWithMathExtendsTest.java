package HomeWork3.calcs.simple;

import HomeWork3.calcs.api.ICalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class CalculatorWithMathExtendsTest {

   private final ICalculator calculator = new CalculatorWithMathExtends();

    @Test
    public void raiseToPower() {
        Assertions.assertEquals(31.359999999999996, calculator.raiseToPower(5.6, 2));
    }

    @Test
    public void squareRoot() {
        Assertions.assertEquals(3, calculator.squareRoot(9));
    }

    @Test
    public void modulus() {
        Assertions.assertEquals(15, calculator.modulus(-15));
    }

    @Test
    public void testCalculator() {
        Assertions.assertEquals(140.45999999999998, calculator.adding(calculator.multiplication(15, 7), calculator.adding(4.1, calculator.raiseToPower(calculator.division(28, 5), 2))));
    }
}