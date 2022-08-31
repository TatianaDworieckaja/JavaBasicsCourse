package HomeWork2.loops;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NumToPowTest {

    @Test
    public void pow() {
        Assertions.assertEquals(1_889_568.0, NumToPow.pow(18.0, 5));
    }

    @Test
    public void pow1() {
        Assertions.assertEquals(56.25, NumToPow.pow(7.5, 2));
    }

    @Test
    public void pow2() {
        Assertions.assertEquals(1, NumToPow.pow(17.5, 0));
    }
}