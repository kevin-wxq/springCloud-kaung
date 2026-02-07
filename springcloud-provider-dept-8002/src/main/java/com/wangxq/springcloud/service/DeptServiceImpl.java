package com.wangxq.springcloud.service;

import com.wangxq.springcloud.dao.DeptDao;
import com.wangxq.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @description: TODO
* @author wxq
* @date 2026/2/2 22:12
* @version 1.0
*/
@Service
public class DeptServiceImpl implements DeptService{

    @Autowired
    private DeptDao deptDao;

    @Override
    public boolean addDept(Dept dept) {
        return deptDao.addDept(dept);
    }

    @Override
    public Dept queryDeptById(Long id) {
        return deptDao.queryDeptById(id);
    }

    @Override
    public List<Dept> queryAllDept() {
        return deptDao.queryAllDept();
    }
}
