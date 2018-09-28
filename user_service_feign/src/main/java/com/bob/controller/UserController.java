package com.bob.controller;

import com.bob.common.util.http.HttpClientResult;
import com.bob.common.util.http.HttpClientUtils;
import com.bob.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

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
        try{
            //测试http工具类
            Map<String, String> params = new HashMap<String, String>();
            params.put("code", "0");
            params.put("message", "helloworld");
            HttpClientResult result = HttpClientUtils.doPost("http://127.0.0.1:8080/userapi/hello/postWithParam", params);
            System.out.println(result);
        }catch (Exception e){
            e.printStackTrace();
        }
        return userService.getUser();
    }

}
