public class InvalidMethodException extends Exception {
    InvalidMethodException() {
        this("Not a valid HTTP method.");
    }

    InvalidMethodException(String message) {
        super(message);
    }
}