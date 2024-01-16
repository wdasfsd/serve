package com.wangyang.dao;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wangyang.domain.LoginInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserDao extends BaseMapper<LoginInfo> {
}
