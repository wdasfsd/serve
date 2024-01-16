package com.wangyang.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wangyang.dao.RegistrationDao;
import com.wangyang.domain.Registration;
import com.wangyang.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegistrationImpl implements RegistrationService {
    @Autowired
    RegistrationDao registrationDao;
    @Override
    public List<Registration> GetAll() {
        QueryWrapper<Registration> queryWrapper = new QueryWrapper<>();
        return registrationDao.selectList(queryWrapper);
    }

    @Override
    public List<Registration> GetByDepartment(String department) {
        QueryWrapper<Registration> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("department",department);
        return registrationDao.selectList(queryWrapper);
    }

    @Override
    public Registration GetById(String idCard) {
        idCard=idCard.trim();
        System.out.println(idCard);
        QueryWrapper<Registration> queryWrapper = new QueryWrapper<>();
        queryWrapper.orderByDesc("patient_id");  // 替换为你的时间戳字段名
        queryWrapper.last("LIMIT 1");
        queryWrapper.eq("id_card_number", idCard);
        return registrationDao.selectOne(queryWrapper);
    }

    @Override
    public boolean Add(Registration registration) {
        registration.setPatientId(null);
        return registrationDao.insert(registration)>0;
    }

    @Override
    public boolean Del(Registration registration) {
        Integer id = registration.getPatientId();
        return registrationDao.deleteById(id)>0;
    }

    @Override
    public boolean UpData(Registration registration) {
        return registrationDao.updateById(registration)>0;
    }
}
