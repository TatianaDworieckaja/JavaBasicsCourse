package HomeWork2.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class ArrayTasks2_4Test {

    private final int array[] = {12, 34, 54, 3, -1, -3, -5, -353638};
    @Test
    public void task2_4_1() {
        Assertions.assertEquals(100, ArrayTasks2_4.task2_4_1(array));
    }

    @Test
    public void task2_4_2() {
        Assertions.assertEquals(54, ArrayTasks2_4.task2_4_2(array));
    }

    @Test
    public void task2_4_3() {
        Assertions.assertEquals("-353638 ", ArrayTasks2_4.task2_4_3(array));
    }

    @Test
    public void task2_4_4() {
        Assertions.assertEquals("-353638", ArrayTasks2_4.task2_4_4(array));
    }

    @Test
    public void task2_4_5() {
        Assertions.assertEquals("[-1, -3, -5, -353638]", ArrayTasks2_4.task2_4_5(array, 2, 54));
    }

    @Test
    public void task2_4_6() {
        int[] array1 = {1, 2, 3, 4, 0};
        Assertions.assertEquals(10, ArrayTasks2_4.task2_4_6(array1));

    }
}