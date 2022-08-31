package HomeWork1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TransitionBytesKilobytesTest {

    @Test
    public void byteToKiloByte() {
        Assertions.assertEquals(1, TransitionBytesKilobytes.byteToKiloByte(1000));
    }

    @Test
   public void kiloByteToByte() {
        Assertions.assertEquals(1000, TransitionBytesKilobytes.kiloByteToByte(1));
    }
}