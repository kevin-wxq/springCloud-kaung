package com.wangxq.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
* @description: TODO
* @author wxq
* @date 2026/2/2 22:26
* @version 1.0
*/
@SpringBootApplication
@EnableEurekaClient //注册服务
@EnableDiscoveryClient //服务发现
public class DeptProvider_8003 {

    public static void main(String[] args) {
        SpringApplication.run(DeptProvider_8003.class, args);
    }

//    @PostConstruct
//    public void init() {
//        System.out.println("Datasource Username: " + environment.getProperty("spring.datasource.username"));
//    }

}
