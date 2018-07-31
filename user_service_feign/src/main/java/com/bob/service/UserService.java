package com.bob.service;

import com.bob.hystric.UserServiceHystric;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author wenhaibo
 * @date 18-7-27
 */

@FeignClient(value = "user-client",fallback = UserServiceHystric.class)  //服务提供者的名字
public interface UserService {
    @RequestMapping(value = "/user/getUser",method = RequestMethod.GET)
    String getUser();
}
