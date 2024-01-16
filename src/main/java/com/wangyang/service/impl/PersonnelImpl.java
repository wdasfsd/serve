package com.wangyang.service.impl;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.wangyang.dao.PersonnelDao;
import com.wangyang.dao.UserDao;
import com.wangyang.domain.LoginInfo;
import com.wangyang.domain.Personnel;
import com.wangyang.service.PersonnelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PersonnelImpl implements PersonnelService {
    @Autowired
    PersonnelDao personnelDao;
    @Autowired
    UserDao userDao;
    @Override
    public List<Personnel> GetAll() {
        QueryWrapper<Personnel> QueryWrapper = new QueryWrapper<>();
        return personnelDao.selectList(QueryWrapper);
    }

    @Override
    public boolean GetById(Personnel personnel) {
        return false;
    }

    @Override
    public boolean Add(Personnel personnel) {
        LoginInfo loginInfo = new LoginInfo(personnel.getName(),"123456",personnel.getPosition(), personnel.getDepartment());
        if(userDao.insert(loginInfo)>0&&personnelDao.insert(personnel)>0){
            return true;
        }else {
            return false;
        }

    }

    @Override
    public boolean Del(Personnel personnel) {
        String id = personnel.getId();
        return personnelDao.deleteById(id)>0;
    }

    @Override
    public boolean UpData(Personnel personnel) {
        UpdateWrapper<LoginInfo> updateWrapper = Wrappers.update();
        updateWrapper.eq("username",personnel.getName());
        LoginInfo loginInfo = new LoginInfo(personnel.getName(),"123456",personnel.getPosition(), personnel.getDepartment());
        return personnelDao.updateById(personnel)>0&&userDao.update(loginInfo,updateWrapper)>0;
    }
}
