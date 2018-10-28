import com.sun.istack.internal.NotNull;
import org.junit.jupiter.api.Test;

import java.io.EOFException;
import java.nio.channels.InterruptedByTimeoutException;
import java.nio.charset.CharacterCodingException;
import java.rmi.NotBoundException;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.*;


class GuessCharTest {
    private GuessChar gs;


    @Test
    void getRandomChar() {

assertEquals('a', 97);


    }


    @Test
    void readFromConsole() {
        Throwable exception = assertThrows(IndexOutOfBoundsException.class, () -> {
            throw new IndexOutOfBoundsException("\nPlease enter something\n");
        });
        assertEquals("\nPlease enter something\n", exception.getMessage());


    }

    @Test
    void testCompareCharForContion1() {
       int chrPlayer=3;

        assertTrue(chrPlayer<0);

    }

    @Test
    void testCompareCharForElseCondition() {
    }







}