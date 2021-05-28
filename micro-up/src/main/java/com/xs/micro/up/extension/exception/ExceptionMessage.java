package com.xs.micro.up.extension.exception;

import java.io.Serializable;

/**
 * @author  wqp
 * @desc 异常信息数据<异常码，数据>
 */
public class ExceptionMessage implements Serializable {

    private static final long serialVersionUID = -4453375910950486837L;

    /**
     * 异常码
     */
    private Integer code;
    /**
     * 异常信息
     */
    private String message;

    public ExceptionMessage() {
        super();
    }

    public ExceptionMessage(Integer code, String message) {
        super();
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("ExceptionData [code=");
        builder.append(code);
        builder.append(", message=");
        builder.append(message);
        builder.append("]");
        return builder.toString();
    }
}
