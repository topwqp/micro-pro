package com.xs.micro.up.extension.exception;

/**
 * @author
 * @desc 业务异常基类
 */
public class BaseBusinessException extends RuntimeException {

    /**
     * 异常数据信息
     */
    public ExceptionMessage exceptionMessage;

    public BaseBusinessException() {
        super();
    }


    public BaseBusinessException(String message, Throwable cause) {
        super(message, cause);
    }

    public BaseBusinessException(String message) {
        super(message);
    }

    public BaseBusinessException(Throwable cause) {
        super(cause);
    }

    public BaseBusinessException(ExceptionMessage exceptionMessage) {
        this.exceptionMessage = exceptionMessage;
    }

    public ExceptionMessage getExceptionMessage() {
        return exceptionMessage;
    }

    public void setExceptionMessage(ExceptionMessage exceptionMessage) {
        this.exceptionMessage = exceptionMessage;
    }
}
