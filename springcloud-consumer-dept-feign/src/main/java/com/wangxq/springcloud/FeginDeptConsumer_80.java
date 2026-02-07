package com.wangxq.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**
* @description: TODO
* @author wxq
* @date 2026/2/2 23:34
* @version 1.0
*/
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages ={"com.wangxq.springcloud"} )
// 微服务启动时加载自定义的类
public class FeginDeptConsumer_80 {
    public static void main(String[] args) {
        SpringApplication.run(FeginDeptConsumer_80.class, args);
    }
}
