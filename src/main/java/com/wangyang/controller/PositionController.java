package com.wangyang.controller;
import com.wangyang.domain.Department;
import com.wangyang.domain.Position;
import com.wangyang.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/position")
@CrossOrigin(value = "http://localhost:9527",allowCredentials ="true")
public class PositionController {
    @Autowired
    PositionService positionService;
    //查询所有
    @GetMapping("/GetAll")
    public Result GetAll(){
        List<Position> positions = positionService.GetAll();
        return new Result(20000,positions);
    }
    //添加
    @PostMapping("/Add")
    public Result Add(@RequestBody Position position){
        boolean add = positionService.Add(position);
        if(add){
            return new Result(20000);
        }else {
            return new Result(50000);
        }
    }
    //删除
    @DeleteMapping("/Del")
    public Result Del(@RequestBody Position position){
        boolean del = positionService.Del(position);
        if(del){
            return new Result(20000);
        }else {
            return new Result(50000);
        }
    }
    //编辑
    @PutMapping("/UpData")
    public Result UpData(@RequestBody Position position){
        boolean b = positionService.UpData(position);
        if(b){
            return new Result(20000);
        }else {
            return new Result(50000);
        }

    }
}
