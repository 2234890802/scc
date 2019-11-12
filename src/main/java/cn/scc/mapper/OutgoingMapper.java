package cn.scc.mapper;

import cn.scc.entity.Outgoing;

public interface OutgoingMapper {
    int deleteByPrimaryKey(Long outgoingId);

    int insert(Outgoing record);

    int insertSelective(Outgoing record);

    Outgoing selectByPrimaryKey(Long outgoingId);

    int updateByPrimaryKeySelective(Outgoing record);

    int updateByPrimaryKey(Outgoing record);
}