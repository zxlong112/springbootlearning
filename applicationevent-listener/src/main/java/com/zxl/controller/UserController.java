package com.zxl.controller;

import com.zxl.bean.UserBean;
import com.zxl.server.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private static Logger logger = LoggerFactory.getLogger(UserController.class);
    //用户业务逻辑实现
    @Autowired
    private UserService userService;

    /**
     * 注册控制方法
     * @param user 用户对象
     * @return
     */
    @RequestMapping(value = "/register")
    public String register(UserBean user) {
        //调用注册业务逻辑
        userService.register(user);
        logger.info("zhucechengg ");
        return "注册成功.";
    }


    @RequestMapping(value = "/register1")
    public String register1(UserBean user) {
        //调用注册业务逻辑
        userService.register(user);
        return "注册成功1.";
    }
}
