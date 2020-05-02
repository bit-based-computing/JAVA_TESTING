package JunitTesting;

public class NotSufficientBalanceException extends RuntimeException {
    public NotSufficientBalanceException() {
        super();
    }

    public NotSufficientBalanceException(String message) {
        super(message);
    }
}
