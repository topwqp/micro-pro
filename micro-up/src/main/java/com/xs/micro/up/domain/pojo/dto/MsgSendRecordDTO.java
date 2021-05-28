package com.xs.micro.up.domain.pojo.dto;

import lombok.Data;

/**
 * @author wangqiupeng
 * @description: 短信记录DTO
 * @date 2019-10-31 7:03 下午
 */
@Data
public class MsgSendRecordDTO extends PageDTO {

    /**
     * 发送员工userId
     */
    private Integer sysUserId;

    /**
     * 被发送短信userId
     */
    private Integer userId;

    /**
     * 被发送短信的用户姓名
     */
    private String username;


    /**
     * 短信模板编号
     */
    private String msgTemplateCode;

    /**
     * 发送开始时间
     */
    private String  sendStartTime;

    /**
     * 发送结束时间
     */
    private String sendEndTime;

    /**
     * 发送状态
     */
    private Integer msgStatus;

}
