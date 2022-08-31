package HomeWork1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NameSwitchTest {

    @Test
    public void welcomVasia() {
        NameSwitch object = new NameSwitch();
        Assertions.assertEquals("Привет\nЯ тебя так долго ждал", object.welcom("Вася"));
    }
    @Test
    public void welcomNastya() {
        NameSwitch object = new NameSwitch();
        Assertions.assertEquals("Я тебя так долго ждал", object.welcom("Анастасия"));
    }

    @Test
    public void welcomWhoAreYou() {
        NameSwitch object = new NameSwitch();
        Assertions.assertEquals("Добрый день, а вы кто?", object.welcom("Tanya"));
    }

}