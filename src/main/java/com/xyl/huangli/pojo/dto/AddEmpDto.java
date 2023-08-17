package com.xyl.huangli.pojo.dto;

import lombok.Data;
/**
 *添加员工实体类
 */

@Data
public class AddEmpDto {

    //员工id
    private Integer id;
    //员工姓名
    private String empName;
    //员工性别
    private String empSex;
    //员工年龄
    private Integer empAge;
    //员工部门名称
    private String empDeptName;

    //员工学历
    private String empDegreeName;
}
