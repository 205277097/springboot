package com.tencent.wxcloudrun.service;

import com.tencent.wxcloudrun.dto.UserDto;
import com.tencent.wxcloudrun.mapper.UserMapper;
import com.tencent.wxcloudrun.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService{

    //从数据库里面调用
    UserRepository repository;

    UserMapper mapper;

    @Override
    public List<UserDto> list() {
        // 把findAll变成一个流，然后用mapper里面toDto的方法去转换一遍,用collect重新Collectors一遍数据，然后toList()
        // 把一段数据打断成一个流
        return repository.findAll().stream().map(mapper::toDto).collect(Collectors.toList());
    }

    @Autowired
    public void setMapper(UserMapper mapper) {
        this.mapper = mapper;
    }

    @Autowired
    public void setRepository(UserRepository repository) {
        this.repository = repository;
    }
}
