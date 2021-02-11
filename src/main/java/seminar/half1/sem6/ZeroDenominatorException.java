package seminar.half1.sem6;

public class ZeroDenominatorException extends Exception{
    public ZeroDenominatorException(String message) {
        super(message);
    }

    public ZeroDenominatorException(String message, Throwable cause) {
        super(message, cause);
    }
}
