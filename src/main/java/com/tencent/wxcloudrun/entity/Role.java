package com.tencent.wxcloudrun.entity;

import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
//权限 角色
public class Role extends AbstractEntity{

    private String name;

    private String title;
}
