package com.xs.micro.invoked.domain.pojo.dto;

import lombok.Data;

/**
 * @author wangqiupeng
 * @description: page dto
 * @date 2019-11-01 9:48 上午
 */
@Data
public class PageDTO {
    /**
     * 当前页
     */
    private Integer pageNum;
    /**
     * 每页条数
     */
    private Integer pageSize;
}
