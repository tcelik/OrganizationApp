package org.csystem.dao;

public class DaoException extends RuntimeException{
    public DaoException() {}

    public DaoException(String msg, Throwable cause)
    {
        super(msg, cause);
    }

    public String getMessage()
    {
        Throwable cause = super.getCause();
        return String.format("Message:%s Cause message:%s", super.getMessage(), cause == null? "null" : cause.getMessage());
    }
}
