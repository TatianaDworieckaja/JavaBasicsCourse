package HomeWork1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SleepInMethodTest {

    @Test
    public void print() {
        Assertions.assertEquals("Можешь спать!", SleepInMethod.print(false, true));
    }

    @Test
    public void print1() {
        Assertions.assertEquals("Можешь спать!", SleepInMethod.print(false, false));
    }

    @Test
    public void print2() {
        Assertions.assertEquals("Можешь спать!", SleepInMethod.print(true, true));
    }

    @Test
    public void print4() {
        Assertions.assertEquals("Пора идти на работу", SleepInMethod.print(true, false));
    }
}