package com.chikaho.mapper;

import com.chikaho.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface UserMapper {

    // 查询所有用户
    List<UserEntity> allUsers();

    // 根据某一字段查询用户
    UserEntity queryUser(@Param("obj") Object obj);

    // 修改某一用户
    boolean updateUser(@Param("id") long id, @Param("user") UserEntity user);

    // 删除用户
    boolean deleteUser(@Param("id") long id);

}
