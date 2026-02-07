package com.wangxq.springcloud.controller;

import com.wangxq.springcloud.pojo.Dept;
import com.wangxq.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
* @description: TODO
* @author wxq
* @date 2026/2/2 23:19
* @version 1.0
*/
@RestController
public class DeptConsumerController {

    //RestTemplate

//    private
    @Autowired
    private RestTemplate restTemplate;

    //Ribbon 通过服务名去访问
//    private static final String REST_URL_PREFIX = "http://localhost:8001";
//    private static final String REST_URL_PREFIX = "http://springcloud-provider-dept-8001";
    private static final String REST_URL_PREFIX = "http://SPRINGCLOUD-PROVIDER-DEPT";

    @Autowired
    private DeptClientService deptClientService = null;

    @RequestMapping("/consumer/dept/add")
    public boolean addDept(Dept dept){
        return this.deptClientService.addDept(dept);
    }

    @RequestMapping("/consumer/dept/get/{id}")
    public Dept getDept(@PathVariable("id") Long id){
        return this.deptClientService.queryDeptById(id);
    }

    @RequestMapping("/consumer/dept/list")
    public List<Dept> getDeptList(){
        return this.deptClientService.queryAllDept();
    }


}
