package exceptions;

public class EmptyFieldsException extends Exception {


    public EmptyFieldsException() {
        super("All fields need to be completed");
    }
}
