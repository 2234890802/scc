package cn.scc.mapper;

import cn.scc.entity.Bed;

public interface BedMapper {
    int deleteByPrimaryKey(Long bedid);

    int insert(Bed record);

    int insertSelective(Bed record);

    Bed selectByPrimaryKey(Long bedid);

    int updateByPrimaryKeySelective(Bed record);

    int updateByPrimaryKey(Bed record);
}