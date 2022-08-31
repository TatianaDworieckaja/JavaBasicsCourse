package HomeWork1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NameIfElseIfTest {

    @Test
    public void welcomVasia() {
        NameIfElseIf object = new NameIfElseIf();
        Assertions.assertEquals("Привет\nЯ тебя так долго ждал", object.welcom("Вася"));
    }
    @Test
    public void welcomNastya() {
        NameIfElseIf object = new NameIfElseIf();
        Assertions.assertEquals("Я тебя так долго ждал", object.welcom("Анастасия"));
    }

    @Test
    public void welcomWhoAreYou() {
        NameIfElseIf object = new NameIfElseIf();
        Assertions.assertEquals("Добрый день, а вы кто?", object.welcom("Tanya"));
    }

}