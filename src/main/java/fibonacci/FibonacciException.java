package fibonacci;

public class FibonacciException extends RuntimeException {
    public FibonacciException() {
        super();
    }

    public FibonacciException(String message) {
        super(message);
    }
}
