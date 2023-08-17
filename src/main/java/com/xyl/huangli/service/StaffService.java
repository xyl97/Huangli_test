package com.xyl.huangli.service;

import com.xyl.huangli.pojo.dto.AddEmpDto;
import com.xyl.huangli.pojo.dto.SearchEmpDto;
import com.xyl.huangli.pojo.dto.UpEmpDto;
import com.xyl.huangli.pojo.vo.StaffListVo;
import com.xyl.huangli.utlis.ResponseResult;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 员工service接口
 */
@Service
public interface StaffService {

    /**
     * 查询全部员工列表  条件查询
     * @param searchEmpDto 条件查询数据
     * @return
     */
    List<StaffListVo> getStaffList(SearchEmpDto searchEmpDto);


    /**
     * 添加员工
     * @param addEmpDto  前端传到后端的数据
     * @return
     */
    ResponseResult addEmp(AddEmpDto addEmpDto);

    /**
     * 根据员工id删除员工
     * @param id 员工id
     * @return
     */
    ResponseResult deleteEmp(Integer id);


    /**
     * 修改员工信息
     * @param upEmpDto 前端获取修改后的员工数据
     * @return
     */
    ResponseResult upEmp(UpEmpDto upEmpDto);
}
