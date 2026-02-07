package com.wangxq.springcloud.dao;

import com.wangxq.springcloud.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
* @description: TODO
* @author wxq
* @date 2026/2/2 22:00
* @version 1.0
*/
@Mapper
@Repository
public interface DeptDao {
    public boolean addDept(Dept dept);

    public Dept queryDeptById(Long id);

    public List<Dept> queryAllDept();
}
