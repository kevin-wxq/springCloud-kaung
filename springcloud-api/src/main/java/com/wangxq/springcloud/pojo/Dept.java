package com.wangxq.springcloud.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
* @description: TODO
* @author wxq
* @date 2026/2/2 20:50
* @version 1.0
*/
@Data
@Accessors(chain=true)
@NoArgsConstructor
public class Dept implements Serializable {
    private Long deptno;
    private String dbname;
    private String db_source;

    public Dept(String dname){
        this.dbname = dname;
    }

}
