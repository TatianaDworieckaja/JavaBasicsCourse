package HomeWork1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DivisionTest {

    @Test
    public void division() {
        Assertions.assertEquals(10.0 + " делится на " + 5.0 + " без остатка. Результат = " + 0.0, Division.division(10, 5));
    }

    @Test
    public void divisionIfResultNotNull() {
        Assertions.assertEquals(11.0 + " не делится на " + 5.0 + " без остатка. Остаток: " + 1.0, Division.division(11, 5));
    }
    @Test
    public void divisionIfNull() {
        Assertions.assertEquals("На ноль делить нельзя", Division.division(11, 0));
    }

    @Test
    public void divisionIfNegative() {
        Assertions.assertEquals(20.0 + " не делится на " + (-10.25) + " без остатка. Остаток: " + 9.75, Division.division(20, -10.25));
    }
}