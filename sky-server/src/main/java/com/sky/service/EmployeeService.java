package com.sky.service;

import com.sky.dto.EmployeeDTO;
import com.sky.dto.EmployeeLoginDTO;
import com.sky.dto.EmployeePageQueryDTO;
import com.sky.entity.Employee;
import com.sky.result.PageResult;

public interface EmployeeService {

    /**
     * 员工登录
     * @param employeeLoginDTO
     * @return
     */
    Employee login(EmployeeLoginDTO employeeLoginDTO);

    /**
     * 新增员工
     * @param employeeDTO
     */
    void save(EmployeeDTO employeeDTO);

    /**
     * 分页查询
     * @param employeePageQueryDTO
     * @return 分页结果
     */
    PageResult pageQuery(EmployeePageQueryDTO employeePageQueryDTO);

    /**
     * 启用或禁用员工账号
     * @param status
     * @param id
     */
    void startOrStop(Integer status, Long id);

    /**
     * 编辑员工信息
     * @param employeeDTO
     */
    void updateInform(EmployeeDTO employeeDTO);

    /**
     * 根据id查询员工信息
     * @param id
     * @return
     */
    Employee getById(Long id);

    /**
     * 修改密码
     * @param empId
     * @param newPassword
     * @param oldPassword
     */
    void editPassword(Long empId, String newPassword, String oldPassword);
}
