package com.xs.micro.invoked.extension.exception;

import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wqp
 * @desc 业务操作操作异常
 */
public class BadOperationException  extends BaseBusinessException {

    private static final long serialVersionUID = 5224436711619531325L;

    /**
     * 参数
     */
    private Map<String, Object> params = new HashMap<String, Object>();

    public BadOperationException() {
    }

    public BadOperationException(ExceptionMessage exceptionMessage) {
        super(exceptionMessage);
    }

    public BadOperationException(String message) {
        super(message);
    }

    public BadOperationException(String message, Throwable cause) {
        super(message, cause);
    }

    public BadOperationException(Throwable cause) {
        super(cause);
    }

    public BadOperationException setParams(final String key, final Object value) {
        this.params.put(key, value);
        return this;
    }

    public BadOperationException setParamsAll(Map<String, Object> params) {
        this.params.putAll(params);
        return this;
    }


    public Object getParamsValue(String key){
        if (StringUtils.isEmpty(key)){
            return null;
        }
        return this.params.get(key);
    }

    public Map<String, Object> getParams(){
        return params;
    }
}
