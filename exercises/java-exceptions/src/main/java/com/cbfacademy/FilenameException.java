package com.cbfacademy;

public class FilenameException extends Exception {

    // Constructor that accepts a custom error message
    public FilenameException(String message) {
        super(message);
    }

    // Optionally, you can also provide a default constructor with no arguments
    public FilenameException() {
        super("Invalid filename provided");
    }

    // Constructor that accepts a custom error message and a cause
    public FilenameException(String message, Throwable cause) {
        super(message, cause);
    }
}
