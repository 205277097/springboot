package com.tencent.wxcloudrun.vo;

import lombok.Data;

import java.util.List;

@Data
public class UserVo {

    public String id;

    private String username;

    private String nickname;

    private List<RoleVo> roles;
}
