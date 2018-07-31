package com.bob.controller;

import com.bob.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wenhaibo
 * @date 18-7-27
 */

@RestController
@RequestMapping("/user/*")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping(value = "/getUser",method = RequestMethod.GET)
    @ApiOperation(value="查询用户",notes="查询用户方法")
    public String getUser(){
        return userService.getUser();
    }

}
