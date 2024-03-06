package com.tencent.wxcloudrun.repository;

import com.tencent.wxcloudrun.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//JpaRepository要传递两个参数,指令一个user后，返回出来的数据模型
public interface UserRepository extends JpaRepository<User, String> {
    User getByUsernameAndNickname(String username, String nickname);
}
