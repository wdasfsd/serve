package com.wangyang.controller;
import com.wangyang.domain.Case;
import com.wangyang.domain.Department;
import com.wangyang.service.CaseService;
import com.wangyang.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/CasesList")
@CrossOrigin(value = "http://localhost:9527",allowCredentials ="true")
public class CaseController {
    @Autowired
    CaseService caseService;
    //查询所有
    @GetMapping("/GetAll")
    public Result GetAll(){
        List<Case> cases = caseService.GetAll();
        return new Result(20000,cases);
    }
    //添加
    @PostMapping("/Add")
    public Result Add(@RequestBody Case c){
        boolean add = caseService.Add(c);
        if(add){
            return new Result(20000);
        }else {
            return new Result(50000);
        }
    }
}
