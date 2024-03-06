package com.tencent.wxcloudrun.controller;

import com.tencent.wxcloudrun.mapper.UserMapper;
import com.tencent.wxcloudrun.service.UserService;
import com.tencent.wxcloudrun.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;


//vo(view object)是对外输出，dto所有的数据外面传入进来，还有一个entity dto可能会承担一些校验的职责
@RestController
@RequestMapping("/users")
public class UserController {

    //先定义好变量，然后再加一个setUserService方法
    UserService userService;

    UserMapper userMapper;

    @GetMapping("/")
    List<UserVo> list(){
        return  userService.list().stream().map(userMapper::toVo).collect(Collectors.toList());
    }

    @Autowired
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    //调用userService的时候，会执行这个方法，然后注入装配这个类
    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
