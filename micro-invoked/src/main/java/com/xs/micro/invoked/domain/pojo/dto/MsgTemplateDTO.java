package com.xs.micro.invoked.domain.pojo.dto;

import lombok.Data;

/**
 * @author wangqiupeng
 * @description: 短信模板DTO
 * @date 2019-10-31 7:02 下午
 */
@Data
public class MsgTemplateDTO extends PageDTO{

    /**
     * 模板ID
     */
    private Integer  id;

    /**
     * 模板代码
     */
    private String msgTemplateCode;

    /**
     * 模板用途
     */
    private String msgTemplatePurpose;

    /**
     * 短信模板内容
     */
    private String msgTemplateContent;

    /**
     * 短信模板状态
     */
    private Integer msgTemplateStatus;

    /**
     * 修改人userId
     */
    private Integer updateUserId;

}
