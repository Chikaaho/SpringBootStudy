package com.chikaho.service;

import com.chikaho.entity.UserEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserService {


    // 查询所有用户
    List<UserEntity> allUsers();

    // 根据某一字段查询用户
    UserEntity queryUser(@Param("obj") Object obj);

    // 修改某一用户
    boolean updateUser(@Param("id") long id, @Param("user") UserEntity user);

    // 删除用户
    boolean deleteUser(@Param("id") long id);

    // 添加用户
    boolean addUser(@Param("user") UserEntity user);

}
