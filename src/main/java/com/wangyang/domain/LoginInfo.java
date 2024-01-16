package com.wangyang.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("user")
@Data
public class LoginInfo {
    @TableId
    Integer id;
    String username;
    String password;
    @TableField(exist = false)
    String token;
    String role;
    @TableField(exist = false)
    String[] roles;
    String Department;

    public LoginInfo(String username, String password, String role, String Department) {
        this.username = username;
        this.password = password;
        this.role = role;
        this.Department = Department;
    }

    public LoginInfo() {
    }

    public LoginInfo(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }
}
