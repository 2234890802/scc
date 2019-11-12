package cn.scc.mapper;

import cn.scc.entity.Service;

public interface ServiceMapper {
    int deleteByPrimaryKey(Long serviceId);

    int insert(Service record);

    int insertSelective(Service record);

    Service selectByPrimaryKey(Long serviceId);

    int updateByPrimaryKeySelective(Service record);

    int updateByPrimaryKey(Service record);
}