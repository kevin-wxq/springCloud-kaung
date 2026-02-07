package com.wangxq.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
* @description: TODO
* @author wxq
* @date 2026/2/2 23:22
* @version 1.0
*/
@Configuration
public class ConfigBean {
    //配置负载均衡实现
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }


//    @Bean
//    public IRule myRule(){
//        return new RandomRule();
//    }
}
