package com.wangyang.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wangyang.domain.Department;
import com.wangyang.domain.Position;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface PositionDao extends BaseMapper<Position> {

}
