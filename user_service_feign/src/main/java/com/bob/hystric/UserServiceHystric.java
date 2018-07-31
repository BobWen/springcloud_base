package com.bob.hystric;

import com.bob.service.UserService;
import org.springframework.stereotype.Component;

/**
 * @author wenhaibo
 * @date 18-7-27
 */

@Component
public class UserServiceHystric implements UserService {

    @Override
    public String getUser() {
        return "sorry Invocation getUser method failed";
    }
}
