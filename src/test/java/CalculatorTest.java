import org.example.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    private Calculator calc;

    @BeforeEach
    void setupCalc(){
        calc = new Calculator();
    }

    @Test
    void testAdd() {
        int res = calc.add(5,6);
        assertEquals(11, res, "add works");

    }

    @Test
    void testSub(){
        assertEquals(0, calc.sub(5,5));
    }

    @Test
    void testMult(){
        assertEquals(25, calc.mult(5,5));
    }

    @Test
    void testDiv(){
        assertEquals(1, calc.div(5,5));
    }

}
