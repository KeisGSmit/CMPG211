public class InvalidMethodException extends RuntimeException {
    InvalidMethodException() {
        this("Not a valid HTTP method.");
    }

    InvalidMethodException(String message) {
        super(message);
    }
}