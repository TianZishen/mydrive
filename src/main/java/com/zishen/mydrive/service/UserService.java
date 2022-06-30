package com.zishen.mydrive.service;

import com.zishen.mydrive.model.User;

public interface UserService {
    public User getByUserNameAndPassword(User user);
}
