package com.tencent.wxcloudrun.entity;
import com.tencent.wxcloudrun.enums.Gender;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import java.util.Date;

//持久层
@Entity
@Data
public class User extends AbstractEntity{

//    字段会自动映射到表里的对应字段，需要统一名称

    private String username;

    private String nickname;

    private String password;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private Boolean locked;

    private Boolean enabled;

    private String lastLoginIp;

    private Date lastLoginTime;


}
