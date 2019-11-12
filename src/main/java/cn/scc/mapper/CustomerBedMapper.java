package cn.scc.mapper;

import cn.scc.entity.CustomerBed;

public interface CustomerBedMapper {
    int deleteByPrimaryKey(Long customerBedId);

    int insert(CustomerBed record);

    int insertSelective(CustomerBed record);

    CustomerBed selectByPrimaryKey(Long customerBedId);

    int updateByPrimaryKeySelective(CustomerBed record);

    int updateByPrimaryKey(CustomerBed record);
}