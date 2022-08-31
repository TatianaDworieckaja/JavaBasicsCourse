package HomeWork2.loops;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumMultiplyTest {

    @Test
    void multiply() {
        Assertions.assertEquals(10080, NumMultiply.multiply(181232375));
    }

    @Test
    void multiply1() {
        Assertions.assertEquals(0, NumMultiply.multiply(0));
    }

    @Test
    void multiply2() {
        Assertions.assertEquals(8, NumMultiply.multiply(8));
    }
}