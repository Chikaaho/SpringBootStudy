package com.chikaho.service.impl;

import com.chikaho.entity.UserEntity;
import com.chikaho.mapper.UserMapper;
import com.chikaho.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<UserEntity> allUsers() {
        return userMapper.allUsers();
    }

    @Override
    public UserEntity queryUser(Object obj) {
        UserEntity user = userMapper.queryUser(obj);
        return user.getIsDeleted() == 1 ? user:null;
    }

    @Override
    public boolean updateUser(long id, UserEntity user) {
        return userMapper.updateUser(id, user);
    }

    @Override
    public boolean deleteUser(long id) {
        return userMapper.deleteUser(id);
    }

    @Override
    public boolean addUser(UserEntity user) {
        return userMapper.addUser(user);
    }
}
