package com.wangyang.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wangyang.domain.Case;
import com.wangyang.domain.Department;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CaseDao extends BaseMapper<Case>{

}
