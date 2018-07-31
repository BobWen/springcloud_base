package com.bob;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author wenhaibo
 * @date 18-7-27
 */

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients  //开启foeign
@EnableHystrix       //开启断路器
@EnableHystrixDashboard  //开启HystrixDashboard监控器
public class UserServiceFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserServiceFeignApplication.class, args);
    }
}
