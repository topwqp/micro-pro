package com.xs.micro.up.domain.pojo.model;

import lombok.Data;

import java.util.Date;

/**
 * @author wqp
 */
@Data
public class UserInfo {
    private Long id;
    private String  username;
    private Date createTime;


}
