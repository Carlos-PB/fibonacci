package fibonacci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Carlos Parra Balches
 *
 * Test cases:
 * fibonacci -1 -> Raises FibonacciException
 * fibonacci 93 -> Raises FibonacciException
 * fibonacci 0 -> 0
 * fibonacci 1 -> 1
 * fibonacci 10 -> 55
 * fibonacci 92 -> 7540113804746346429
 */
class FibonacciTest {
    @Test
    public void shouldComputeRaiseAnExceptionIfNumberIsMinusOne() {
        assertThrows(FibonacciException.class, () -> Fibonacci.compute(-1));
    }

    @Test
    public void shouldComputeRaiseAnExceptionIfNumberIsNinetyThree() {
        assertThrows(FibonacciException.class, () -> Fibonacci.compute(93));
    }

    @Test
    public void shouldComputeReturnZeroIfNumberEqualsZero() {
        long expectedValue = 0;
        long obtainedValue = Fibonacci.compute(0);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void shouldComputeReturnOneIfNumberEqualsOne() {
        long expectedValue = 1;
        long obtainedValue = Fibonacci.compute(1);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void shouldComputeReturnFiftyFiveIfNumberEqualsTen() {
        long expectedValue = 55;
        long obtainedValue = Fibonacci.compute(10);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void shouldComputeReturn7540113804746346429IfNumberEqualsNinetyTwo() {
        long expectedValue = 7540113804746346429L;
        long obtainedValue = Fibonacci.compute(92);

        assertEquals(expectedValue, obtainedValue);
    }
}