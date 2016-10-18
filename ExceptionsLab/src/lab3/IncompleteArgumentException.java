package lab3;

/**
 * Created by wboyer on 10/18/2016.
 */
public class IncompleteArgumentException extends Exception {
    private static String MSG = "A full name must include a first and last name.";

    public IncompleteArgumentException() {
        super(MSG);
    }

    public IncompleteArgumentException(String message) {
        super(message);
    }
}
