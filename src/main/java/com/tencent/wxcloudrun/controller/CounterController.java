package com.tencent.wxcloudrun.controller;

import org.springframework.web.bind.annotation.*;

/**
 * counter控制器
 */
@RestController
@CrossOrigin
public class CounterController {




  //get请求后缀都是hello入口的都会返回hello word 如@GetMapping("say") 则要在后面加上/say
  @RequestMapping("/api/say")
  @GetMapping(value = "/api/say")
  public String sayHello() {
//    User user = new User();
//    user.getId();
    return "已点击.";
  }
  
}