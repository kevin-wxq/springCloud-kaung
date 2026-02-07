package com.wangxq.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
* @description: TODO
* @author wxq
* @date 2026/2/3 16:32
* @version 1.0
*/
@SpringBootApplication
@EnableEurekaServer //服务端的启动类
public class EurekaServer_7003 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer_7003.class,args);
    }
}
