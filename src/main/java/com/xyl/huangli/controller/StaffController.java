package com.xyl.huangli.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.xyl.huangli.pojo.dto.AddEmpDto;
import com.xyl.huangli.pojo.dto.SearchEmpDto;
import com.xyl.huangli.pojo.dto.UpEmpDto;
import com.xyl.huangli.pojo.vo.StaffListVo;
import com.xyl.huangli.service.StaffService;
import com.xyl.huangli.utlis.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 员工控制器
 */
@RestController
@RequestMapping("/emp")
public class StaffController {

    @Autowired
    private StaffService staffService;

    //查询员工信息
    @PostMapping("list")
    public ResponseResult<List<StaffListVo>> selectStaffList(@RequestBody SearchEmpDto searchEmpDto, @RequestParam(value = "pageNo" ,defaultValue = "1")Integer pageNo,
                                                             @RequestParam(value = "pageSize",defaultValue = "2") Integer pageSize){

        Page page = PageHelper.startPage(pageNo,pageSize);
        List<StaffListVo> getAllList = staffService.getStaffList(searchEmpDto);
        System.out.println(getAllList);
        return ResponseResult.success(getAllList,page);

    }

    /**
     *  添加员工
     * @param addEmpDto 前端发送的员工数据
     * @return
     */
    @PostMapping("add")
    public ResponseResult addEmp (@RequestBody AddEmpDto addEmpDto){
//        addEmpDto.setId();  //应该手动添加id
        //校验数据
        if ("".equals(addEmpDto.getEmpName())){
            return ResponseResult.verifyFailed("姓名不能为空！");
        }
        if (addEmpDto.getEmpAge()==null){
            return ResponseResult.verifyFailed("年龄不能为空！");
        }
        if ("".equals(addEmpDto.getEmpSex())){
            return ResponseResult.verifyFailed("性别不能为空！");
        }
        if ("".equals(addEmpDto.getEmpDeptName())){
            return ResponseResult.verifyFailed("部门不能为空！");
        }
        if ("".equals(addEmpDto.getEmpDegreeName())){
            return ResponseResult.verifyFailed("学历不能为空！");
        }
        return staffService.addEmp(addEmpDto);
    }

    /**
     * 通过员工id删除员工
     * @param id 员工id
     * @return
     */
    @DeleteMapping("deleteEmp/{id}")
    public ResponseResult deleteEmp (@PathVariable(value = "id")  Integer id){

        if (id==null){
            return ResponseResult.verifyFailed("请选择员工");

        }
        return staffService.deleteEmp(id);
    }

    /**
     * 修改员工信息
     * @param upEmpDto  前端获取修改后的员工数据
     * @return
     */
    @PutMapping("update")
    public ResponseResult updateEmp (@RequestBody UpEmpDto upEmpDto) {

        return staffService.upEmp(upEmpDto);
    }
}
