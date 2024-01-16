package com.wangyang.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wangyang.dao.DepartmentDao;
import com.wangyang.domain.Department;
import com.wangyang.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentImpl implements DepartmentService {
    @Autowired
    DepartmentDao departmentDao;
    @Override
    public List<Department> GetAll() {
        QueryWrapper<Department> departmentQueryWrapper = new QueryWrapper<>();
        return departmentDao.selectList(departmentQueryWrapper);
    }

    @Override
    public boolean GetById(Department department) {
        return false;
    }

    @Override
    public boolean Add(Department department) {
        return departmentDao.insert(department)>0;
    }

    @Override
    public boolean Del(Department department) {
        String id = department.getId();
        return departmentDao.deleteById(id)>0;
    }

    @Override
    public boolean UpData(Department department) {
        return departmentDao.updateById(department)>0;
    }
}
