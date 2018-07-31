package com.bob.contorller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user/*")
public class UserContorller {
    @ResponseBody
    @RequestMapping(value = "/getUser",method = RequestMethod.GET)
    public String getUser(){
     return "hello! my name is bob";
    }
}
