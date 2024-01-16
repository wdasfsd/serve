package com.wangyang.service;
import com.wangyang.domain.Case;
import java.util.List;

public interface CaseService {
    /*查询所有*/
    List<Case> GetAll();
    /*根据身份证查询病例*/
    List<Case> GetByIdCardNumber(String IdCardNumber);
    /*添加*/
    boolean Add(Case c);
}
