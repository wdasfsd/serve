package com.wangyang.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wangyang.domain.Department;
import com.wangyang.domain.Personnel;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface DepartmentDao extends BaseMapper<Department>{

}
