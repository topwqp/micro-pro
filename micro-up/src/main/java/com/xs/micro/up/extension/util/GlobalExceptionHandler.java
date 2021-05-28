package com.xs.micro.up.extension.util;

import com.alibaba.fastjson.JSON;
import com.xiangshang360.middleware.sdk.entity.GlobalResponseEntity;
import com.xiangshang360.middleware.sdk.entity.HttpStatusCode;
import com.xs.micro.up.extension.exception.BadOperationException;
import com.xs.micro.up.extension.exception.ProcessingException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * Controller全局处理handle类
 * @author wqp
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    private static final Logger LOG = LoggerFactory.getLogger(GlobalExceptionHandler.class);


    @ResponseBody
    @ExceptionHandler
    public GlobalResponseEntity exceptionHandler(HttpServletRequest request, ProcessingException ex) {

        // 请求地址
        String requestURI = request.getRequestURI();
        // 请求参数
        Map<String, String[]> parameterMap = request.getParameterMap();
        LOG.error(String.format("request Uri:[%s] handle processingException... params:[%s]", requestURI, JSON.toJSONString(parameterMap)), ex);

        if (ex.getExceptionMessage() != null) {
            // 用户自定义异常
            return GlobalResponseEntity.failure(HttpStatusCode.SERVICE_PROCESSING, ex.getExceptionMessage().getMessage());
        }

        // 默认统一提示：
        return GlobalResponseEntity.failure(HttpStatusCode.SERVICE_PROCESSING, "处理未知异常");
    }


    @ResponseBody
    @ExceptionHandler
    public GlobalResponseEntity exceptionHandler(HttpServletRequest request, BadOperationException ex) {

        // 请求地址
        String requestURI = request.getRequestURI();
        // 请求参数
        Map<String, String[]> parameterMap = request.getParameterMap();
        LOG.error(String.format("request Uri:[%s] handle badOperationException... params:[%s]", requestURI, JSON.toJSONString(parameterMap)), ex);

        if (ex.getExceptionMessage() != null) {
            // 用户自定义异常
            return new GlobalResponseEntity(HttpStatusCode.SERVICE_ERROR, ex.getMessage(), ex.getParams());
        }

        // 默认统一提示：
        return new GlobalResponseEntity(HttpStatusCode.SERVICE_ERROR, "业务处理异常", ex.getParams());
    }

    /**
     * 拦截统一的异常，返回code=500和异常信息
     * @param request
     * @param e
     * @return
     */
    @ResponseBody
    @ExceptionHandler(value = RuntimeException.class)
    public GlobalResponseEntity jsonErrorHandler(HttpServletRequest request, RuntimeException e) {
        String requestURI = request.getRequestURI();
        Map<String, String[]> parameterMap = request.getParameterMap();
        LOG.error(String.format("request Uri :[%s] handle exception ... params:[%s]",requestURI,JSON.toJSONString(parameterMap)),e);
        if (e instanceof IllegalArgumentException || e instanceof IllegalStateException){
            //如果是状态和参数异常,可以处理特定的
            return GlobalResponseEntity.failure(HttpStatusCode.PARAMS_ERROR, e.getMessage());
        }
        return GlobalResponseEntity.failure(e.getMessage());
    }
}
