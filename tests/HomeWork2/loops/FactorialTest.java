package HomeWork2.loops;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FactorialTest {

    @Test
    public void fact() {
        Assertions.assertEquals(120, Factorial.fact(5));
    }

    @Test
    public void fact1() {
        Assertions.assertEquals(1, Factorial.fact(1));
    }

    @Test
    public void fact2() {
        Assertions.assertEquals(0, Factorial.fact(0));
    }
}