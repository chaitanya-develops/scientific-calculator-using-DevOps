import static org.junit.Assert.*;
import Calculator.Calculator;
import org.junit.Test;

public class CalculatorTest {
    private static final double DELTA = 1e-15;
    Calculator calculator = new Calculator();

    @Test
    public void squareRootTruePositive() {
        assertEquals("Finding square root of a number for True Positive", 5.0, calculator.squareRoot(25), DELTA);
        assertEquals("Finding square root of a number for True Positive", 4.0, calculator.squareRoot(16), DELTA);
    }

    @Test
    public void squareRootTrueNagative() {
        assertNotEquals("Finding square root for False Positive", 5.0, calculator.squareRoot(125), DELTA);
        assertNotEquals("Finding square root for False Positive", 1.0, calculator.squareRoot(81), DELTA);

    }




}
