package HomeWork1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LetterOrSymbolTest {

    @Test
    public void letter() {
        Assertions.assertEquals("Это буква: z", LetterOrSymbol.letterOrSymbol('z'));
    }

    @Test
    public void symbol() {
        Assertions.assertEquals("Это не буква, а символ: &", LetterOrSymbol.letterOrSymbol('&'));
    }
}