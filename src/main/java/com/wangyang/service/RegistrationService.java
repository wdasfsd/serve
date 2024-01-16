package com.wangyang.service;

import com.wangyang.domain.Personnel;
import com.wangyang.domain.Registration;

import java.util.List;

public interface RegistrationService {
    /*查询所有*/
    List<Registration> GetAll();
    /*根据科室查询*/
    List<Registration> GetByDepartment(String department);
    /*查询单个*/
    Registration GetById(String idCard);
    /*添加*/
    boolean Add(Registration registration);
    /*删除*/
    boolean Del(Registration registration);
    /*更新*/
    boolean UpData(Registration registration);
}
