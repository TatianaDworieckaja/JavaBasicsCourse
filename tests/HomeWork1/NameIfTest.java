package HomeWork1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NameIfTest {

    @Test
    public void welcomVasia() {
        NameIf object = new NameIf();
        Assertions.assertEquals("Привет\nЯ тебя так долго ждал", object.welcom("Вася"));
    }
    @Test
    public void welcomNastya() {
        NameIf object = new NameIf();
        Assertions.assertEquals("Я тебя так долго ждал", object.welcom("Анастасия"));
    }

    @Test
    public void welcomWhoAreYou() {
        NameIf object = new NameIf();
        Assertions.assertEquals("Добрый день, а вы кто?", object.welcom("Tanya"));
    }


}