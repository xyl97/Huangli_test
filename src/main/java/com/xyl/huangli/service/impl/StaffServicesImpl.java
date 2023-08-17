package com.xyl.huangli.service.impl;


import com.xyl.huangli.dao.StaffMapper;
import com.xyl.huangli.pojo.dto.AddEmpDto;
import com.xyl.huangli.pojo.dto.SearchEmpDto;
import com.xyl.huangli.pojo.dto.UpEmpDto;
import com.xyl.huangli.pojo.vo.StaffListVo;
import com.xyl.huangli.service.StaffService;
import com.xyl.huangli.utlis.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 员工service接口实现类
 */
@Service
public class StaffServicesImpl implements StaffService {

   @Autowired
   private StaffMapper staffMapper;

    //查询员工信息，并且根据员工姓名查询员工
    @Override
    public List<StaffListVo> getStaffList(SearchEmpDto searchEmpDto) {
        return staffMapper.selectStaff(searchEmpDto);
    }

    /**
     * 添加用户
     * @param addEmpDto  前端传到后端的数据
     * @return
     */
    @Override
    public ResponseResult addEmp(AddEmpDto addEmpDto) {
        boolean add = staffMapper.addEmp(addEmpDto);
        if (add){
            return ResponseResult.success("添加成功");

        }else {
            return ResponseResult.fail("添加失败");
        }
    }


    /**
     * 根据员工id删除员工
     * @param id 员工id
     * @return
     */
    @Override
    public ResponseResult deleteEmp(Integer id) {
        boolean del = staffMapper.deletEmp(id);
        if (del){
            return ResponseResult.success("删除成功");
        }else {
            return ResponseResult.fail("删除失败");
        }

    }

    /**
     * 修改员工数据
     * @param upEmpDto 前端获取修改后的员工数据
     * @return
     */
    @Override
    public ResponseResult upEmp(UpEmpDto upEmpDto) {
       boolean upd= staffMapper.upEmp(upEmpDto);
       if (upd){
           return ResponseResult.success("修改成功");
       }else {
           return ResponseResult.fail("修改失败");
       }
    }
}
