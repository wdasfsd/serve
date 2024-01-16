package com.wangyang.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.wangyang.dao.CaseDao;
import com.wangyang.dao.PersonnelDao;
import com.wangyang.dao.UserDao;
import com.wangyang.domain.Case;
import com.wangyang.domain.LoginInfo;
import com.wangyang.domain.Personnel;
import com.wangyang.service.CaseService;
import com.wangyang.service.PersonnelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class CaseImpl implements CaseService {
    @Autowired
    CaseDao caseDao;
    @Override
    public List<Case> GetAll() {
        QueryWrapper<Case> caseQueryWrapper = new QueryWrapper<>();
        return caseDao.selectList(caseQueryWrapper);
    }

    @Override
    public List<Case> GetByIdCardNumber(String IdCardNumber) {
        QueryWrapper<Case> caseQueryWrapper = new QueryWrapper<>();
        caseQueryWrapper.eq("idCardNumber",IdCardNumber);
        return caseDao.selectList(caseQueryWrapper);
    }

    @Override
    public boolean Add(Case c) {
        return caseDao.insert(c)>0;
    }
}
