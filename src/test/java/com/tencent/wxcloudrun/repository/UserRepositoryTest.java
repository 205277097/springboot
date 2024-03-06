package com.tencent.wxcloudrun.repository;

import com.tencent.wxcloudrun.entity.User;
import com.tencent.wxcloudrun.enums.Gender;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class UserRepositoryTest {

//    可以对成员变量、方法和构造函数进行标注，来完成自动装配的工作，
//    @Autowired标注可以放在成员变量上，也可以放在成员变量的set方法上，也可以放在任意方法上表示，
//    自动执行当前方法，如果方法有参数，会在IOC容器中自动寻找同类型参数为其传值。
    @Autowired
    UserRepository respository;
    @Test
    void findByUsername() {
        User user = new User();
        user.setUsername("kai");
        user.setNickname("kai-name");
        user.setEnabled(true);
        user.setLocked(false);
        user.setPassword("123456789");
        user.setGender(Gender.MALE);
        user.setLastLoginIp("127.0.0.1");
        user.setLastLoginTime(new Date());

        User savedUser = respository.save(user);

        User result = respository.getByUsernameAndNickname("kai", "kai-name");
        System.out.print(result.toString());
    }
}