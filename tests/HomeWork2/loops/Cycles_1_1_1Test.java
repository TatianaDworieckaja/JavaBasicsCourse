package HomeWork2.loops;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Cycles_1_1_1Test {

    @Test
    public void multiplication() {
        Assertions.assertEquals(120, Cycles_1_1_1.multiplication(5));
    }

    @Test
    public void multiplication1() {
        Assertions.assertEquals(0, Cycles_1_1_1.multiplication(0));
    }
}
