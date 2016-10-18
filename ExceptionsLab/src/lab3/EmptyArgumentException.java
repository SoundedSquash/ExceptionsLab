package lab3;

/**
 * Created by wboyer on 10/18/2016.
 */
public class EmptyArgumentException extends Exception {
    private static String MSG = "Input cannot be empty.";

    public EmptyArgumentException() {
        super(MSG);
    }

    public EmptyArgumentException(String message) {
        super(message);
    }
}
