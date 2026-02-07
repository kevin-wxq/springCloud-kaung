package com.wangxq.springcloud.service;

import com.wangxq.springcloud.pojo.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
* @description: TODO
* @author wxq
* @date 2026/2/7 13:56
* @version 1.0
*/
@Component
@FeignClient(value = "springcloud-provider-dept",fallbackFactory = DeptClientServiceFallbackFactory.class)
public interface DeptClientService {


    @PostMapping("dept/add")
    public boolean addDept(Dept dept);

    @GetMapping("/dept/get/{id}")
    public Dept queryDeptById(@PathVariable("id") Long id);

    @GetMapping("/dept/list")
    public List<Dept> queryAllDept();
}
