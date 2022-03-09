package fibonacci;

/**
 * @author Carlos Parra Balches
 */
public class Fibonacci {
    private static final int MAX_NUMBER = 92;

    /**
     * Computes the term of the Fibonacci sequence whose index is number.
     *
     * Fibonacci sequence:
     * f(0) = 0
     * f(1) = 1
     * f(n) = f(n - 1) + f(n - 2) for n > 1
     *
     * @param number Index of the term to compute.
     * @return f(number).
     * @throws FibonacciException if number < 0 or number > MAX_NUMBER.
     */
    public static long compute(int number) {
        if(number < 0 || number > MAX_NUMBER) {
            throw new FibonacciException("Can't compute fibonacci(" + number + "). The value must be between 0 and " + MAX_NUMBER + ".");
        }

        if(number == 0) {
            return 0;
        }

        long previousNumber = 0;
        long currentNumber = 1;

        for(int i = 0; i < number - 1; i++) {
            currentNumber += previousNumber;
            previousNumber = currentNumber  - previousNumber;
        }

        return currentNumber;
    }
}
