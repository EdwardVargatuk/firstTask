import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(value = Parameterized.class)
public class GuessCharTestParameterized {


    private char pass_value1;
    private char pass_value2;
    private int expected_result;
    private GuessChar gs;

    @Parameterized.Parameters
    public static Collection set_of_parameters() {
        return Arrays.asList(new Object[][]{
                        {'a', 'j', 1},
                        {'j', 'a', 2},
                        {'5', 'j', 3},
                        {'ю', 'j', 3},
                        {'k', 'k', 0},
                }
        );
    }

    public GuessCharTestParameterized(char pass_value1, char pass_value2, int expected_result) {
        this.pass_value1 = pass_value1;
        this.pass_value2 =pass_value2;
        this.expected_result = expected_result;
    }
    @Before
    public void setUp() {
        gs = new GuessChar();
    }
    @Test
    public void testcompareChar() {
        assertEquals(expected_result, gs.compareChar(pass_value1,pass_value2));
    }
}

