package org.cystem.dal;

public class DalException extends  RuntimeException {

    public DalException() {}

    public DalException(String msg)
    {
        this(msg, null);
    }

    public DalException(String msg , Throwable ex)
    {
        super(msg, ex);
    }

    @Override
    public String getMessage()
    {
        Throwable cause = super.getCause();

        return String.format("Message:%s Cause message:%s", super.getMessage(), cause == null? "null" : cause.getMessage());
    }
}
