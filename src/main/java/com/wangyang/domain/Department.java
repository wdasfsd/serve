package com.wangyang.domain;

import javax.annotation.sql.DataSourceDefinition;


public class Department {
    String id;
    String departmentname;
    String doctor;
    String servicearea;
    String openingtime;
    String principal;
    String tel;
    String address;

    public Department(String id, String departmentname, String doctor, String servicearea, String openingtime, String principal, String tel, String address) {
        this.id = id;
        this.departmentname = departmentname;
        this.doctor = doctor;
        this.servicearea = servicearea;
        this.openingtime = openingtime;
        this.principal = principal;
        this.tel = tel;
        this.address = address;
    }

    public Department() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDepartmentname() {
        return departmentname;
    }

    public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getServicearea() {
        return servicearea;
    }

    public void setServicearea(String servicearea) {
        this.servicearea = servicearea;
    }

    public String getOpeningtime() {
        return openingtime;
    }

    public void setOpeningtime(String openingtime) {
        this.openingtime = openingtime;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id='" + id + '\'' +
                ", departmentname='" + departmentname + '\'' +
                ", doctor='" + doctor + '\'' +
                ", servicearea='" + servicearea + '\'' +
                ", openingtime='" + openingtime + '\'' +
                ", principal='" + principal + '\'' +
                ", tel='" + tel + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
