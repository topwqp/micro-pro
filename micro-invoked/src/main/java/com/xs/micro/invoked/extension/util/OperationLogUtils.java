package com.xs.micro.invoked.extension.util;

import com.alibaba.fastjson.JSON;

/**
 * @author wqp
 * @date 日志拼接
 */
public class OperationLogUtils {
    /**
     * 拼装日志内容
     *
     * @param baseString
     * @param params
     * @return
     */
    public static final String logContent(String baseString, Object... params) {
        StringBuilder sb = new StringBuilder(baseString);
        if (params != null && params.length > 0) {
            for (int i = 0; i < params.length; i++) {
                sb.append(" | param_");
                sb.append(i + 1);
                sb.append("=");
                sb.append(JSON.toJSONStringWithDateFormat(params[i], "yyyy-MM-dd HH:mm:ss"));
            }
        }
        return sb.toString();
    }

}
