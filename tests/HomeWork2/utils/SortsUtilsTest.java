package HomeWork2.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortsUtilsTest {

    private final int[] arr1 = new int[]{1, 2, 3, 4, 5, 6};
    private final int[] arr2 = new int[]{1, 1, 1, 1};
    private final int[] arr3 = new int[]{9, 1, 5, 99, 9, 9};
    private final int[] arr4 = new int[]{};
    private final int[] arr5 = new int[]{6, 5, 4, 3, 2, 1};

    @Test
    public void bubble() {
        SortsUtils.bubble(arr1);
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, arr1);
        SortsUtils.bubble(arr2);
        Assertions.assertArrayEquals(new int[]{1, 1, 1, 1}, arr2);
        SortsUtils.bubble(arr3);
        Assertions.assertArrayEquals(new int[]{1, 5, 9, 9, 9, 99}, arr3);
        SortsUtils.bubble(arr4);
        Assertions.assertArrayEquals(new int[]{}, arr4);
        SortsUtils.bubble(arr5);
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, arr5);
    }

    @Test
    public void shake() {
        SortsUtils.shake(arr1);
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, arr1);
        SortsUtils.shake(arr2);
        Assertions.assertArrayEquals(new int[]{1, 1, 1, 1}, arr2);
        SortsUtils.shake(arr3);
        Assertions.assertArrayEquals(new int[]{1, 5, 9, 9, 9, 99}, arr3);
        SortsUtils.shake(arr4);
        Assertions.assertArrayEquals(new int[]{}, arr4);
        SortsUtils.shake(arr5);
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, arr5);
    }
}