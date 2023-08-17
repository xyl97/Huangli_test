package com.xyl.huangli.pojo.vo;

import lombok.Data;

/**
 * 员工信息实体类
 */
@Data
public class StaffListVo  {


    //员工id
    private int id;

    //员工姓名
    private String empName;

    //员工性别
    private String sex;

    //员工年龄
    private String age;

    //员工部门名称
    private String deptName;

    //员工学历
    private String empDegreeName;
}
