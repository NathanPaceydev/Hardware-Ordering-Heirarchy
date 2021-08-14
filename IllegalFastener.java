
import java.io.Serial;
import java.io.Serializable;

public class IllegalFastener extends Exception implements Serializable {
    @Serial
    private static final long serialVersionUID = -8263953039237402359L;

    public IllegalFastener(String message) { super(message); }

}
