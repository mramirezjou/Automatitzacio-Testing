package cat.inspla.ra3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void TODO_addAmbPositiusRetornaSumaCorrecta() {

        assertEquals(12, calculator.add(5,7));

        assertEquals(15, calculator.add(10,5));

    }

    @Test
    void TODO_divideByZeroLlançaExcepció() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(10, 0);
        });
    }
}
