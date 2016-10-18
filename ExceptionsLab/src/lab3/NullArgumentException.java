package lab3;

/**
 * Created by wboyer on 10/18/2016.
 */
public class NullArgumentException extends Exception {
    private static String MSG = "Program has been cancelled.";

    public NullArgumentException() {
        super(MSG);
    }

    public NullArgumentException(String message) {
        super(message);
    }
}
