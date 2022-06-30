package com.zishen.mydrive.dao.mapper;

import com.zishen.mydrive.model.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    User getByUserNameAndPassword(User user);
}
