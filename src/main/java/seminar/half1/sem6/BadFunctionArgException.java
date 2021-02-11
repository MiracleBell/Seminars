package seminar.half1.sem6;

public class BadFunctionArgException extends Exception{
    public BadFunctionArgException(String message) {
        super(message);
    }

    public BadFunctionArgException(String message, Throwable cause) {
        super(message, cause);
    }
}
