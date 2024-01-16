package com.wangyang.service;
import java.util.List;
import com.wangyang.domain.Personnel;
/*
* 人员表接口
* */
public interface PersonnelService {
    /*查询所有*/
    List<Personnel> GetAll();
    /*查询单个*/
    boolean GetById(Personnel personnel);
    /*添加*/
    boolean Add(Personnel personnel);
    /*删除*/
    boolean Del(Personnel personnel);
    /*更新*/
    boolean UpData(Personnel personnel);
}
