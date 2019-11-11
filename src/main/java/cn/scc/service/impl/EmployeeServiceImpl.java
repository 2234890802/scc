package cn.scc.service.impl;

import cn.scc.entity.Employee;
import cn.scc.mapper.EmployeeMapper;
import cn.scc.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Program: scc
 * Package: cn.scc.service.impl
 * Description:
 *
 * @Author: ZL
 * @Date: 2019-11-08 15:01
 */

@Service("EmployeeServiceImpl")
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;

    public Employee login(Employee employee) {
        return employeeMapper.login(employee);
    }
}
