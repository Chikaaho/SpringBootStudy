package com.chikaho.controller;

import com.chikaho.entity.UserEntity;
import com.chikaho.service.impl.UserServiceImpl;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserServiceImpl userService;

    private static String ERROR_MESSAGE;

    // 查询所有用户的信息
    @RequestMapping("/allUser.html")
    public String queryAllUser(Model model) {
        List<UserEntity> user = userService.allUsers();
        model.addAttribute("list", user);
        return "users/allUser";
    }

    // 添加用户信息
    @RequestMapping("/addUser.html")
    public void addUser(@Param("user") UserEntity userEntity, Model model) {
        if (userEntity.getUsername().length() <= 6 && userEntity.getUsername().length() >= 20){
            ERROR_MESSAGE = "用户名长度为6~20,请重新输入信息";
            model.addAttribute("error_message", ERROR_MESSAGE);
        }


        userService.addUser(userEntity);
    }

}
