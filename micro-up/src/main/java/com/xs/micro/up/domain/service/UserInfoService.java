package com.xs.micro.up.domain.service;

import com.xs.micro.up.domain.dao.UserInfoMapper;
import com.xs.micro.up.domain.pojo.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wqp
 */
@Service
public class UserInfoService {
    @Autowired
    private UserInfoMapper userInfoMapper;

    public long insertUserInfo(UserInfo userInfo){
        return  userInfoMapper.insert(userInfo);
    }
}
