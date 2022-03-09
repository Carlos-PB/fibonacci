package fibonacci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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