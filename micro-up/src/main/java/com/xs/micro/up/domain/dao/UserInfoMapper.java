package com.xs.micro.up.domain.dao;

import com.xs.micro.up.domain.pojo.model.UserInfo;

/**
 * @author wqp
 * @date 2020年11月24日16:28:19
 */
public interface UserInfoMapper {
    /**
     * 插入信息
     * @param userInfo
     * @return
     */
    long insert(UserInfo userInfo);
}
