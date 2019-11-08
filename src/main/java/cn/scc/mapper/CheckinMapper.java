package cn.scc.mapper;

import cn.scc.entity.Checkin;

public interface CheckinMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Checkin record);

    int insertSelective(Checkin record);

    Checkin selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Checkin record);

    int updateByPrimaryKey(Checkin record);
}