package com.tencent.wxcloudrun.dto;

import com.tencent.wxcloudrun.vo.RoleVo;
import lombok.Data;

import java.util.List;

@Data
public class UserDto {
    public String id;

    private String username;

    private String nickname;

    private List<RoleVo> roles;
}
