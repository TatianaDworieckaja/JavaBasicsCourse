package HomeWork1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TypeOfYearTest {

    @Test
    public void typeOfYear1() {
        Assertions.assertEquals("Этот год - високосный", TypeOfYear.typeOfYear(2024));
    }

    @Test
    public void typeOfYear2() {
        Assertions.assertEquals("Этот год - невисокосный", TypeOfYear.typeOfYear(2021));
    }

    //negative test type - Test failed.
    @Test
    public void typeOfYear3() {
        Assertions.assertEquals("Этот год - невисокосный", TypeOfYear.typeOfYear(2022));
    }
}