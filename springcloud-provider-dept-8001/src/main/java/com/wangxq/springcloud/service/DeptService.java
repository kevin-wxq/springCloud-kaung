package com.wangxq.springcloud.service;

import com.wangxq.springcloud.pojo.Dept;

import java.util.List;

/**
* @description: TODO
* @author wxq
* @date 2026/2/2 22:11
* @version 1.0
*/
public interface DeptService {
    public boolean addDept(Dept dept);

    public Dept queryDeptById(Long id);

    public List<Dept> queryAllDept();
}
