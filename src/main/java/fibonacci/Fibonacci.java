package fibonacci;

public class Fibonacci {
    private static int MAX_NUMBER = 20;

    public static long compute(int number) {
        if(number < 0 || number > MAX_NUMBER) {
            throw new FibonacciException("Can't compute " + number + "!. The value must be between 0 and " + MAX_NUMBER + ".");
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
