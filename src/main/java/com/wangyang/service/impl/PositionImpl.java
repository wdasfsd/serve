package com.wangyang.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.wangyang.dao.DepartmentDao;
import com.wangyang.dao.PositionDao;
import com.wangyang.domain.Department;
import com.wangyang.domain.Position;
import com.wangyang.service.DepartmentService;
import com.wangyang.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionImpl implements PositionService {

    @Autowired
    PositionDao positionDao;

    @Override
    public List<Position> GetAll() {
        QueryWrapper<Position> positionQueryWrapper = new QueryWrapper<>();
        return positionDao.selectList(positionQueryWrapper);
    }

    @Override
    public boolean GetById(Position position) {
        return false;
    }

    @Override
    public boolean Add(Position position) {
        return positionDao.insert(position)>0;
    }

    @Override
    public boolean Del(Position position) {
        String id = position.getId();
        return positionDao.deleteById(id)>0;
    }

    @Override
    public boolean UpData(Position position) {
        return positionDao.updateById(position)>0;
    }
}
