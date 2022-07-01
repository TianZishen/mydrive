package com.zishen.mydrive.service.impl;

import com.zishen.mydrive.dao.mapper.UserMapper;
import com.zishen.mydrive.model.User;
import com.zishen.mydrive.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;
    @Override
    public User getByUserNameAndPassword(User user) {
        User loginUser = userMapper.getByUserNameAndPassword(user);
        if(loginUser == null){
            return new User();
        }
        return loginUser;
    }
}
