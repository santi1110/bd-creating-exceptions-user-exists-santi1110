package main;

/**
 * Custom exception for when we try to create a new user but one with
 * duplicate fields already exists.
 */
public class UserExistsException extends Exception {

    public UserExistsException() {
        super();
        //implement this method
    }

    public UserExistsException(String message) {
        super(message);
        //implement this method
    }

    public UserExistsException(String message, Throwable e) {
        super(message,e);
        //implement this method
    }

    public UserExistsException(Throwable e) {
        super(e);
        //implement this method
    }
}
