package com.xs.micro.invoked.domain.pojo.dto;

import lombok.Data;

import java.util.Date;

/**
 * @author wangqiupeng
 * @description: 短信配置DTO
 * @date 2019-11-26 11:59 上午
 */
@Data
public class SmsConfigDTO {
    /**
     * 主键
     */
    private Integer  id;

    /**
     * 修改的配置值
     */
    private String  configValue;

    /**
     *  更新时间
     */
    private Date updateTime;

}
