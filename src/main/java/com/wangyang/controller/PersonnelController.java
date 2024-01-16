package com.wangyang.controller;
import com.wangyang.dao.UserDao;
import com.wangyang.domain.LoginInfo;
import com.wangyang.domain.Personnel;
import com.wangyang.service.PersonnelService;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/personnel")
@CrossOrigin(value = "http://localhost:9527",allowCredentials ="true")
public class PersonnelController {
    @Autowired
    PersonnelService personnelService;
    //查询所有
    @GetMapping("/GetAll")
    public Result GetAll(){
        List<Personnel> Personnel = personnelService.GetAll();
        return new Result(20000,Personnel);
    }
    //添加
    @PostMapping("/Add")
    public Result Add(@RequestBody Personnel personnel){
        boolean add = personnelService.Add(personnel);
        if(add){
            return new Result(20000);
        }else {
            return new Result(50000);
        }
    }
    //删除
    @DeleteMapping("/Del")
    public Result Del(@RequestBody Personnel personnel){
        System.out.println(personnel);
        boolean del = personnelService.Del(personnel);
        if(del){
            return new Result(20000);
        }else {
            return new Result(50000);
        }
    }
    //编辑
    @PutMapping("/UpData")
    public Result UpData(@RequestBody Personnel personnel){
        boolean b = personnelService.UpData(personnel);
        if(b){
            return new Result(20000);
        }else {
            return new Result(50000);
        }

    }
}
