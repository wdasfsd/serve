package com.wangyang.controller;
import com.wangyang.domain.Department;
import com.wangyang.domain.Personnel;
import com.wangyang.service.DepartmentService;
import com.wangyang.service.PersonnelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/department")
@CrossOrigin(value = "http://localhost:9527",allowCredentials ="true")
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;
    //查询所有
    @GetMapping("/GetAll")
    public Result GetAll(){
        List<Department> departments = departmentService.GetAll();
        return new Result(20000,departments);
    }
    //添加
    @PostMapping("/Add")
    public Result Add(@RequestBody Department department){
        System.out.println(department);
        boolean add = departmentService.Add(department);
        if(add){
            return new Result(20000);
        }else {
            return new Result(50000);
        }
    }
    //删除
    @DeleteMapping("/Del")
    public Result Del(@RequestBody Department department){
        boolean del = departmentService.Del(department);
        if(del){
            return new Result(20000);
        }else {
            return new Result(50000);
        }
    }
    //编辑
    @PutMapping("/UpData")
    public Result UpData(@RequestBody Department department){
        boolean b = departmentService.UpData(department);
        if(b){
            return new Result(20000);
        }else {
            return new Result(50000);
        }

    }
}
