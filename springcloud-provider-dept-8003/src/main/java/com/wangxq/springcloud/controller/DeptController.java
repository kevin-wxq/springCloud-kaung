package com.wangxq.springcloud.controller;

import com.wangxq.springcloud.pojo.Dept;
import com.wangxq.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
* @description: TODO
* @author wxq
* @date 2026/2/2 22:16
* @version 1.0
*/
@RestController
public class DeptController{

    @Autowired
    private DeptService deptService;

    @Autowired
    private DiscoveryClient discoveryClient;

    @PostMapping("/dept/add")
    public boolean addDept(Dept dept){
        return deptService.addDept(dept);
    }

    @GetMapping("/dept/get/{id}")
    public Dept getDeptById(@PathVariable("id") Long id){
        return deptService.queryDeptById(id);
    }

    @GetMapping("/dept/list")
    public List<Dept> queryAllDept() {
        List<Dept> depts = deptService.queryAllDept();
        System.out.println(depts);
        return depts;
    }

    @RequestMapping("/dept/discovery")
    public Object discovery(){
        List<String> services = discoveryClient.getServices();
        System.out.println(services);
        List<ServiceInstance> instances = discoveryClient.getInstances("springcloud-provider-dept");
        for (ServiceInstance instance : instances) {
            System.out.println(instance.getHost()+"\t"+
                    instance.getPort()+"\t"+
                    instance.getUri()+"\t"+
                    instance.getServiceId());
//            RestTemplate restTemplate = new RestTemplate();
//            InfoEndpoint infoEndpoint = restTemplate.getForObject(instance.getUri()+ "/actuator/info", InfoEndpoint.class);
//            System.out.println(infoEndpoint);
        }
        return  this.discoveryClient;
    }

}
