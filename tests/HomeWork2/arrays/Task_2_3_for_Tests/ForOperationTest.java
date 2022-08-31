package HomeWork2.arrays.Task_2_3_for_Tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ForOperationTest {

    private ForOperation object = new ForOperation();

    @Test
    void printAll() {
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Assertions.assertEquals("[1, 2, 3, 4, 5, 6, 7, 8, 9]",object.printAll(array) );
    }

    @Test
    void printEverySecond() {
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Assertions.assertEquals("[2, 4, 6, 8]",object.printEverySecond(array) );
    }

    @Test
    void printReverse() {
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Assertions.assertEquals("[9, 8, 7, 6, 5, 4, 3, 2, 1]",object.printReverse(array) );
    }
}