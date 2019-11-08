package cn.scc.mapper;

import cn.scc.entity.Bed;

public interface BedMapper {
    int deleteByPrimaryKey(Long bedId);

    int insert(Bed record);

    int insertSelective(Bed record);

    Bed selectByPrimaryKey(Long bedId);

    int updateByPrimaryKeySelective(Bed record);

    int updateByPrimaryKey(Bed record);
}