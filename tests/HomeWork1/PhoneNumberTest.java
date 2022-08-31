package HomeWork1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneNumberTest {

    @Test
    public void createNumber() {
        int array[] = {1, 2, 3, 4, 5 ,6 ,7, 8, 9, 0};
        Assertions.assertEquals("(123) 456-7890", PhoneNumber.createNumber(array));
    }
}