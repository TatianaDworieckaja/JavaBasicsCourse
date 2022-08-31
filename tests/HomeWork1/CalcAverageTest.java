package HomeWork1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalcAverageTest {

    @Test
    public void calcAverage() {
        Assertions.assertEquals(2, CalcAverage.calcAverage(1, 2, 3));
    }

    @Test
    public void calcAverageIfNegative() {
        Assertions.assertEquals(1, CalcAverage.calcAverage(1, -2, 3));
    }

    @Test
    public void calcAverageIfNull() {
        Assertions.assertEquals(0, CalcAverage.calcAverage(0, -2, 3));
    }
}