package HomeWork1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class EvenAndOddNumberTest {

    @Test
    public void evenNumber() {
        Assertions.assertEquals("It is an even number", EvenAndOddNumber.evenAndOdd(4));
    }

    @Test
    public void oddNumber() {
        Assertions.assertEquals("It is an odd number", EvenAndOddNumber.evenAndOdd(5));
    }

    @Test
    public void evenNumberIfNull() {
        Assertions.assertEquals("It is an even number", EvenAndOddNumber.evenAndOdd(0));
    }

    @Test
    public void oddNumberIfNegative() {
        Assertions.assertEquals("It is an odd number", EvenAndOddNumber.evenAndOdd(-7));
    }
}