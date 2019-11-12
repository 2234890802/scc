package cn.scc.mapper;

import cn.scc.entity.CheckIn;

public interface CheckInMapper {
    int deleteByPrimaryKey(Long checkInId);

    int insert(CheckIn record);

    int insertSelective(CheckIn record);

    CheckIn selectByPrimaryKey(Long checkInId);

    int updateByPrimaryKeySelective(CheckIn record);

    int updateByPrimaryKey(CheckIn record);
}