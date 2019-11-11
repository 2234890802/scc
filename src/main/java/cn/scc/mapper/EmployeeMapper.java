package cn.scc.mapper;

import cn.scc.entity.Employee;

public interface EmployeeMapper {
    int deleteByPrimaryKey(Long empId);

    int insert(Employee record);

    int insertSelective(Employee record);

    Employee selectByPrimaryKey(Long empId);

    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKey(Employee record);

    Employee login(Employee employee);
}