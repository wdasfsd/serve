package com.wangyang.controller;
import com.wangyang.domain.Position;
import com.wangyang.domain.Registration;
import com.wangyang.service.PositionService;
import com.wangyang.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.List;

@RestController
@RequestMapping(value = "/api/registration", produces = "application/json;charset=UTF-8")
@CrossOrigin(value = "http://localhost:9527",allowCredentials ="true")
public class RegistrationController{
    @Autowired
    RegistrationService registrationService;
    //查询所有
    @GetMapping("/GetAll")
    public Result GetAll(){
        List<Registration> registrations = registrationService.GetAll();
        return new Result(20000,registrations);
    }
    //根据科室进行查询
    @PostMapping("/ByDepartment")
    public Result GetByDepartment(@RequestBody String department) throws UnsupportedEncodingException {
        department = URLDecoder.decode(department, StandardCharsets.UTF_8.toString()).replace("=", "");
        List<Registration> registrations = registrationService.GetByDepartment(department);
        return new Result(20000,registrations);
    }
    //添加
    @PostMapping("/Add")
    public Result Add(@RequestBody Registration registration){
        boolean add = registrationService.Add(registration);
        if(add){
            return new Result(20000);
        }else {
            return new Result(50000);
        }
    }
    //查询单个
    @GetMapping("/SelectById")
    public Result SelectById(String idCard){
        System.out.println(idCard);
        Registration registration1 = registrationService.GetById(idCard);
        return new Result(20000,registration1);
    }
    //删除
    @DeleteMapping("/Del")
    public Result Del(@RequestBody Registration registration){
        boolean del = registrationService.Del(registration);
        if(del){
            return new Result(20000);
        }else {
            return new Result(50000);
        }
    }
    //编辑
    @PutMapping("/UpData")
    public Result UpData(@RequestBody Registration registration){
        boolean b = registrationService.UpData(registration);
        if(b){
            return new Result(20000);
        }else {
            return new Result(50000);
        }
    }
}
