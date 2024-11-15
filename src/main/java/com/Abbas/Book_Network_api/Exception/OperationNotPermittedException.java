package com.Abbas.Book_Network_api.Exception;

public class OperationNotPermittedException  extends RuntimeException {

    public OperationNotPermittedException() {
    }

    public OperationNotPermittedException(String message) {
        super(message);
    }

}
