package com.wangyang.service;
import com.wangyang.domain.Department;
import com.wangyang.domain.Personnel;

import java.util.List;
/*
* 科室表接口
* */
public interface DepartmentService {
    /*查询所有*/
    List<Department> GetAll();
    /*查询单个*/
    boolean GetById(Department department);
    /*添加*/
    boolean Add(Department department);
    /*删除*/
    boolean Del(Department department);
    /*更新*/
    boolean UpData(Department department);
}
