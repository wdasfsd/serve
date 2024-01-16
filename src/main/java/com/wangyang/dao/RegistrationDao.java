package com.wangyang.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wangyang.domain.Registration;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RegistrationDao extends BaseMapper<Registration> {

}
