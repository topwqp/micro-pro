package com.xs.micro.invoked.extension.exception;

/**
 * @author wqp
 * @desc 未知异常 待处理
 */
public class ProcessingException extends BaseBusinessException {

    public ProcessingException() {
    }

    public ProcessingException(ExceptionMessage exceptionMessage) {
        super(exceptionMessage);
    }

    public ProcessingException(String message) {
        super(message);
    }

    public ProcessingException(String message, Throwable cause) {
        super(message, cause);
    }

    public ProcessingException(Throwable cause) {
        super(cause);
    }
}
