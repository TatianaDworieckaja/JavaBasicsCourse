package HomeWork2.loops;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NumMethodsTest {

    @Test
    public void max() {
        Assertions.assertEquals(8, NumMethods.max(7865));
    }

    @Test
    public void percentage() {
        int randArray[] = {1, 2, 3, 4, 5, 6, 7, 8};
        Assertions.assertEquals(50.0, NumMethods.percentage(randArray));

    }

    @Test
    public void evenAndOdd() {
        Assertions.assertEquals("even: " + 2 + ", odd: " + 2, NumMethods.evenAndOdd(1234));
    }

    @Test
    public void fibSeq() {
        Assertions.assertEquals("0 1 1 2", NumMethods.fibSeq(3));
    }

    @Test
    public void seriesWithStep() {
        Assertions.assertEquals("1 2 3 4 5", NumMethods.seriesWithStep(1, 5, 1));
    }

    @Test
   public void numReverse() {
        Assertions.assertEquals("321", NumMethods.numReverse(123));

    }
}