package com.wangyang.service;

import com.wangyang.domain.Personnel;
import com.wangyang.domain.Position;

import java.util.List;

/*
* 职位表接口
* */
public interface PositionService {
    /*查询所有*/
    List<Position> GetAll();
    /*查询单个*/
    boolean GetById(Position position);
    /*添加*/
    boolean Add(Position position);
    /*删除*/
    boolean Del(Position position);
    /*更新*/
    boolean UpData(Position position);
}
