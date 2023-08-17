package com.xyl.huangli.dao;

import com.xyl.huangli.pojo.dto.AddEmpDto;
import com.xyl.huangli.pojo.dto.SearchEmpDto;
import com.xyl.huangli.pojo.dto.UpEmpDto;
import com.xyl.huangli.pojo.vo.StaffListVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StaffMapper {

    //查询员工信息，并且根据员工姓名查询员工
    List<StaffListVo> selectStaff(SearchEmpDto searchEmpDto);


    /**
     * 添加员工
     * @param addEmpDto 前端发送员工数据
     * @return
     */
    boolean addEmp(AddEmpDto addEmpDto);

    /**
     * 根据员工id删除员工
     * @param id 员工id
     * @return
     */
    boolean deletEmp(Integer id);

    /**
     * 修改员工数据
     * @param upEmpDto 前端获取修改后的员工数据
     * @return
     */
    boolean upEmp(UpEmpDto upEmpDto);
}
