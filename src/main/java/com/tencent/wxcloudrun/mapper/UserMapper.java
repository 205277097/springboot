package com.tencent.wxcloudrun.mapper;

import com.tencent.wxcloudrun.dto.UserDto;
import com.tencent.wxcloudrun.entity.User;
import com.tencent.wxcloudrun.vo.UserVo;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;


@Mapper(componentModel = "spring")
@Component
public interface UserMapper {
    UserDto toDto(User user);

    UserVo toVo(UserDto userDto);
}
