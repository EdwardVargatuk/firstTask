import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class GuessCharTest {
    static GuessChar gs;

    @BeforeAll
    static public void init() {
        gs = new GuessChar();
    }

    @Test
    void testToGetRandomChar() {
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            char randomChar = gs.getRandomChar();
            list.add(randomChar);
        }
        assertTrue(list.contains('a'));
        assertTrue(list.contains('z'));
        assertFalse(list.contains('A'));
        assertNotNull(list);
    }

    @Ignore
    @Test
    void testIsShouldThrowExceptionReadFromConsole() {
        Throwable exception = assertThrows(IndexOutOfBoundsException.class, () -> {
            throw new IndexOutOfBoundsException("\nPlease enter something\n");
        });
        assertEquals("\nPlease enter something\n", exception.getMessage());
    }

    @ParameterizedTest
    @CsvSource(value = {"j, a, 2",
            "a, j, 1",
            "5, j, 3",
            "ю, j, 3",
            "k, k, 0"})
    void testCompareCharForConditions(char pass_val, char pass_val2, int expected_res) {
        assertEquals(expected_res, gs.compareChar(pass_val, pass_val2));

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