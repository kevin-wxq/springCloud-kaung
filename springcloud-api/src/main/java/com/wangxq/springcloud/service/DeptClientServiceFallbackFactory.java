package com.wangxq.springcloud.service;

import com.wangxq.springcloud.pojo.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

/**
* @description: TODO
* @author wxq
* @date 2026/2/7 16:15
* @version 1.0
*/
@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory {
    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public boolean addDept(Dept dept) {
                return false;
            }

            @Override
            public Dept queryDeptById(Long id) {
                return new Dept()
                        .setDeptno(id)
                        .setDbname("id=>" + id + ",部门不存在");
            }

            @Override
            public List<Dept> queryAllDept() {
                return Collections.emptyList();
            }
        };
    }
}
