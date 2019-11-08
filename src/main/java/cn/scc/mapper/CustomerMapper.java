package cn.scc.mapper;

import cn.scc.entity.Customer;

public interface CustomerMapper {
    int deleteByPrimaryKey(Long cusid);

    int insert(Customer record);

    int insertSelective(Customer record);

    Customer selectByPrimaryKey(Long cusid);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);
}