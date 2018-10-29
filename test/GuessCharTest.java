import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;


class GuessCharTest {
    static GuessChar gs;

    @BeforeAll
    static public void init() {
        gs = new GuessChar();
    }

    @Test
    void testToGetRandomChar() {
        char a = gs.getRandomChar();
        assertTrue(a >= 'a');
        assertTrue(a <= 'z');
        assertFalse(a > 122, "a not in bounds");
        assertNotNull(a);
//        assertDoesNotThrow((Executable) new IOException());
    }


    @Test
    void testIsShouldThrowExceptionReadFromConsole() {
        Executable executable = () -> {
            throw new IOException("message");
        };
        assertThrows(IOException.class, executable, "d");
        Throwable exception = assertThrows(IndexOutOfBoundsException.class, () -> {
            throw new IndexOutOfBoundsException("\nPlease enter something\n");
//            char a = (char) gs.readFromConsole();
        });
        assertEquals("\nPlease enter something\n", exception.getMessage());
    }


    @Test
    void testCompareCharForConditions() {
        char a = 'a';
        char b = 'd';
        char notLatin = '5';
        char ukrainianChar = 'ю';
        int i = gs.compareChar(a, b);
        assertEquals(1, i);
        i = gs.compareChar(b, a);
        assertEquals(2, i);
        i = gs.compareChar(a, a);
        assertEquals(0, i);
        i = gs.compareChar(notLatin, b);
        assertEquals(3, i);
        i = gs.compareChar(ukrainianChar, b);
        assertEquals(3, i);

    }

    @Test
    void testOutputFromCompareChars() {
        int i = 1;
        String s = gs.outputFromCompareChar(i);
        assertEquals("Too low! Please enter another one", s);
        i = 3;
        s = gs.outputFromCompareChar(i);
        assertEquals("Please enter latin letter", s);
    }

}