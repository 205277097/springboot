package com.tencent.wxcloudrun.entity;
import com.tencent.wxcloudrun.enums.Gender;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

//持久层 用户表
@Entity
@Data
public class User extends AbstractEntity{

//    字段会自动映射到表里的对应字段，需要统一名称

//    给一个独立的索引
    @Column(unique = true)
    private String username;

    private String nickname;

//    JoinColumn 和 inverseJoinColumns 对应外链（数据库）的参数
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"))
    private List<Role> roles;

    private String password;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private Boolean locked;

    private Boolean enabled;

    private String lastLoginIp;

    private Date lastLoginTime;


}
